package experiments;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Instant;
import java.util.Arrays;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Base58CodeGeneratorTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(Base58CodeGeneratorTest.class);


    @Test
    public void shouldConvertDecimalToBase58() {
        long before = Instant.now().toEpochMilli();
        Base58CodeGenerator generator = new Base58CodeGenerator();
        Set<Long> longs = generator.generateRandomUniqueLongs(30_000_000);
        assertEquals(30_000_000, longs.size());
        longs.parallelStream().forEach(e-> conv);

        long[] result = generator.convertDecimalToBase58(generator.powerN(58, 8)-1L);
        long after = Instant.now().toEpochMilli();
        long duration = after-before;
        LOGGER.info("Total duration = " + duration);
        LOGGER.info("result: " + Arrays.toString(result));
    }

    @Test
    void shouldGenerateLongs() {
        Base58CodeGenerator generator = new Base58CodeGenerator();
        Instant before = Instant.now();
        Set<Long> result = generator.generateRandomUniqueLongs(30_000_000);
        Instant after = Instant.now();
        long duration = after.toEpochMilli()-before.toEpochMilli();
        LOGGER.info("Total duration = " + duration);
    }
}