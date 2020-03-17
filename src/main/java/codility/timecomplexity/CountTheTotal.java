package codility.timecomplexity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.time.Instant;

class CountTheTotal {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountTheTotal.class);


    int countTheTotalSlow(int n) {
        Instant start = Instant.now();
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result = result + i;
        }
        logTime(start);
        return result;
    }

    private void logTime(Instant start) {
        Instant finish = Instant.now();
        long duration = Duration.between(start, finish).toNanos();
        LOGGER.info("slow duration: " + duration);
    }

    int countTheTotalFast(int n) {
        Instant start = Instant.now();
        int result = n * (n + 1) / 2;

        logTime(start);
        return result;

    }


}
