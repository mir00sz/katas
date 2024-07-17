package experiments;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExceptionsWorkflow {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExceptionsWorkflow.class);

    public void letsThrowAnException() throws RuntimeException {
        LOGGER.info("before exception");
        Object o = null;

            o.toString();

        LOGGER.info("end before exception");


    }
}
