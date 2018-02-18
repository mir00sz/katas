import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciRecursiveTest {

    @Test
    void getNthFibonacci() {
        assertFib(1, 0);
        assertFib(2,1);
        assertFib(3,1);
        assertFib(5,5);
        assertFib(50, 12586269025L);
        assertFib(32, 2178309L);
    }

    private void assertFib(int n, long expectedResult) {
        FibonacciRecursive fibonacciNumbers = new FibonacciRecursive();
        long result = fibonacciNumbers.getNthFibonacci(n);
        assertEquals(expectedResult,result);
    }
}