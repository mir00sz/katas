import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciNotRecursiveTest {

    @Test
    void getNthFibonacci() {
        assertFib(0, 0);
        assertFib(2,1);
        assertFib(3,2);
        assertFib(5,5);
        assertFib(50, 12586269025L);
        assertFib(32, 2178309L);
    }

    private void assertFib(int n, long expectedResult) {
        FibonacciNotRecursive fibonacciNumbers = new FibonacciNotRecursive();
        long result = fibonacciNumbers.getNthFibonacci(n);
        assertEquals(expectedResult,result);
    }
}