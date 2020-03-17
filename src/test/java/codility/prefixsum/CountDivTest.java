package codility.prefixsum;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CountDivTest {


    @ParameterizedTest
    @MethodSource("provideInputs")
    void simple(int a, int b, int k, int expected) {

        CountDiv countDiv = new CountDiv();
        assertEquals(expected, countDiv.solution(a, b, k));

    }



    private static Stream<Arguments> provideInputs() {
        return Stream.of(
                Arguments.of(11, 345, 17, 20),
                Arguments.of(6, 11, 2, 3),
                Arguments.of(101, 123000000, 10000, 12345)
        );
    }

}