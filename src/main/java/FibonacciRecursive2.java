public class FibonacciRecursive2 {


    //0,1,1,2,3,5,8

    long getNthFibonacci(int n) {
        if(n==0) {
            return 0;
        } else if (n==1 || n==2) {
            return 1;
        }

        return getNthFibonacci(n-1) + getNthFibonacci(n-2);
    }
}
