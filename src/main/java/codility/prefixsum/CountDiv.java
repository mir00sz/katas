package codility.prefixsum;

public class CountDiv {


    public int solution(int A, int B, int K) {
        // write your code in Java SE 8
        int result = 0;
        if((A%K) == 0 || (B%K) == 0) {
            result++;
        }

        int diff = B-A;
        int mod = diff/K;

        result += mod;

        return result;
    }
}
