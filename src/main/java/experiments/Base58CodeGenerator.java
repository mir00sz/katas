package experiments;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.SecureRandom;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class Base58CodeGenerator {

    private static final Logger LOGGER = LoggerFactory.getLogger(Base58CodeGenerator.class);


    public long[] convertDecimalToBase58(long number) {
        if (number > powerN(58, 8) - 1) {
            throw new IllegalArgumentException("Too big number");
        }

        long[] result = new long[9];
        long tmpNumber = number;
        int currentIndex = result.length - 1;

        while (tmpNumber / 58 > 0) {
            long rest = tmpNumber % 58;
            tmpNumber = tmpNumber / 58;
            result[currentIndex] = rest;
            currentIndex--;
        }
        return result;
    }

    public Set<Long> generateRandomUniqueLongs(int numberOfLongs) {


        long range = powerN(58, 8)-1;

        return SecureRandom.getInstanceStrong() .current()
                .longs(range)
                .distinct()
                .limit(numberOfLongs)
                .boxed()
                .collect(Collectors.toSet());
    }

    public long powerN(long number, int power) {
        long res = 1;
        long sq = number;
        while (power > 0) {
            if (power % 2 == 1) {
                res *= sq;
            }
            sq = sq * sq;
            power /= 2;
        }
        return res;
    }

}
