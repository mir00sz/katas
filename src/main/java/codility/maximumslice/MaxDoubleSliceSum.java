package codility.maximumslice;

/**
 * TODO
 */
public class MaxDoubleSliceSum {

    public int solution(int[] A) {
        int maxEnding = 0;
        int maxSlice = 0;
        int maxEndingIndex = -1;
        for (int i = 0; i < A.length; i++) {
            int a = A[i];
            maxEnding = Math.max(0, maxEnding + a);
            if (maxEnding > maxSlice) maxEndingIndex = i;
            maxSlice = Math.max(maxSlice, maxEnding);
        }

        int minInSlice = -10001;
        int maxSliceCopy = maxSlice;
        int maxEndingIndexCopy = maxEndingIndex;

        while (maxSliceCopy != 0) {
            maxSliceCopy = maxSliceCopy - A[maxEndingIndexCopy];
            maxEndingIndexCopy--;
        }
        return 0;
    }
}
