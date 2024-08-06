package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class NumbersWithEvenNumberOfDigitsTest {


    public static Stream<Arguments> params() {
        return Stream.of(Arguments.of(new int[]{12, 345, 2, 6, 7896}, 2),
                Arguments.of(new int[]{555, 901, 482, 1771}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("params")
    void shouldReturnCorrectNumberOfEvenDigits(int[] input, int expected) {
        NumbersWithEvenNumberOfDigits n = new NumbersWithEvenNumberOfDigits();
        assertEquals(expected, n.findNumbers(input));
    }

}