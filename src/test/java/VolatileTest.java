import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.CountDownLatch;


public class VolatileTest {


    private static final Logger LOGGER = LoggerFactory.getLogger(VolatileTest.class);

    /**
     * if this value is not volatile then text printed in console is different.
     */
    private static volatile int MY_INT = 0;


    @Test
    public void volatileTestsss() throws InterruptedException {
        CountDownLatch cdl = new CountDownLatch(2);
        ChangeListener.setCdl(cdl);
        ChangeMaker.setCDL(cdl);
        new ChangeListener().start();
        new ChangeMaker().start();
        cdl.await();
    }


    static class ChangeListener extends Thread {
        private static CountDownLatch CDL;

        @Override
        public void run() {
            int local_value = MY_INT;
            while (local_value < 5) {
                if (local_value != MY_INT) {
                    LOGGER.info("Got Change for MY_INT : {}", MY_INT);
                    local_value = MY_INT;
                }
            }
            CDL.countDown();
        }

        static void setCdl(CountDownLatch cdl) {
            ChangeListener.CDL = cdl;
        }
    }

    static class ChangeMaker extends Thread {
        private static CountDownLatch CDL;


        @Override
        public void run() {

            int local_value = MY_INT;
            while (MY_INT < 5) {
                LOGGER.info("Incrementing MY_INT to {}", local_value + 1);
                MY_INT = ++local_value;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            CDL.countDown();
        }

        static void setCDL(CountDownLatch CDL) {
            ChangeMaker.CDL = CDL;
        }
    }
}
