package codility.sorting;

import java.util.Arrays;

public class MaxProductOfThree {

    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);

        int neg = A[0]*A[1]*A[A.length-1];
        int pos = A[A.length-1]*A[A.length-2]*A[A.length-3];

        return Math.max(pos, neg);
    }
}
