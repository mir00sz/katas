package codility.maximumslice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxDoubleSliceSumTest {


    @Test
    public void maxDoubleSliceSumTest(){
        int[] arr = {3, 2, 6, -1, 4, 5, -1, 2};
        MaxDoubleSliceSum maxDoubleSliceSum = new MaxDoubleSliceSum();
        int result = maxDoubleSliceSum.solution(arr);
        assertEquals(17, result);
    }

}