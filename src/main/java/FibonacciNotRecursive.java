public class FibonacciNotRecursive {

    long getNthFibonacci(int n) {

        if(n==0) {
            return 0;
        } else if (n==1) {
            return 1;
        }

        long[] lastTwoFNumbers = new long[2];
        lastTwoFNumbers[1] = 1;
        for (int i=2; i<=n; i++) {
            long newFNumber = lastTwoFNumbers[0] + lastTwoFNumbers[1];
            lastTwoFNumbers[0] = lastTwoFNumbers[1];
            lastTwoFNumbers[1] = newFNumber;
        }

        return lastTwoFNumbers[1];
    }
}
