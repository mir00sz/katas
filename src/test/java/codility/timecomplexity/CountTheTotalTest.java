package codility.timecomplexity;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.time.Instant;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class CountTheTotalTest {


    private static final Logger LOGGER = LoggerFactory.getLogger(CountTheTotalTest.class);


    @Test
    void shouldReturnTotalOfN() {

        int n = 1000000000;
        Instant start = Instant.now();
        int expectedSum = IntStream.range(1, n + 1).sum();
        Instant finish = Instant.now();
        long duration = Duration.between(start,finish).toNanos();
        LOGGER.info("Stream sum time: " + duration);

        CountTheTotal countTheTotal = new CountTheTotal();
        int sum = countTheTotal.countTheTotalSlow(n);
        assertEquals(expectedSum, sum);

        sum = countTheTotal.countTheTotalFast(n);
        assertEquals(expectedSum, sum);

    }
}