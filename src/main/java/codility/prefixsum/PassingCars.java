package codility.prefixsum;

public class PassingCars {

    public int solution(int[] A) {
        // write your code in Java SE 8
        int[] prefixSums = new int[A.length];
        prefixSums[0] = A[0];
        for(int i = 1; i < A.length; i++) {
            prefixSums[i] = prefixSums[i-1] + A[i];
        }

        int result = 0;
        for(int i = 0; i < A.length; i++) {
            if (A[i]==0) {
                int passingCarsAhead = prefixSums[A.length-1] - prefixSums[i];
                result+=passingCarsAhead;
                if (result>1000000000){
                    return -1;
                }
            }

        }

        return result;
    }
}
