package codility.sorting;

import java.util.Arrays;

public class NumberOfDiscIntersections {


    public int solution(int[] A) {
        // write your code in Java SE 8
        if (A.length == 0) {
            return 0;
        }

        long[] activated = new long[A.length];
        long[] deactivated = new long[A.length];

        for (int i = 0; i < A.length; i++) {
            activated[i] = (long) i - (long) A[i];
            deactivated[i] = (long) i + (long) A[i];
        }
        Arrays.sort(activated);
        Arrays.sort(deactivated);

        long currentActive = 0;
        int activatedIndex = 0;
        int result = 0;

        for (long l : deactivated) {
            while (activatedIndex < activated.length && activated[activatedIndex] <= l) {
                activatedIndex++;
                currentActive++;
            }
            currentActive--;
            result += currentActive;

            if (result > 10000000) {
                return -1;
            }

        }

        return result;
    }
}
