package codility.prefixsum;

public class CountDiv {


    public int solution(int A, int B, int K) {
        // write your code in Java SE 8
        if (A % K > 0) {
            return (B - (A - A % K)) / K;
        }

        if (A % K == 0) {
            return ((B - (A - A % K)) / K) + 1;
        }

        return -1;


    }
}
