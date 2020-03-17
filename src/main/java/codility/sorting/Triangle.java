package codility.sorting;

import java.util.Arrays;

public class Triangle {

    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        for (int i = 0; i < A.length-2; i++) {
            if (A[i+1] > A[i+2]-A[i]) {
                return 1;
            }
        }

        return 0;
    }
}
