class FibonacciRecursive {


    private long getNthFibonacciNumber(long prevMinusTwo, long prevMinusOne, int iteration, int n) {

        if (iteration == n) {
            return prevMinusOne + prevMinusTwo;
        } else
            iteration += 1;
        return getNthFibonacciNumber(prevMinusOne, prevMinusOne + prevMinusTwo, iteration, n);
    }


    long getNthFibonacci(int n) {

        if (n == 1) {
            return 0;
        }

        if (n == 2 || n == 3) {
            return 1;
        }
        return getNthFibonacciNumber(1L, 2L, 4, n);
    }

}
