package codility.timecomplexity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermCheckTest {


    @Test
    public void permCheckTest(){
        PermCheck permCheck = new PermCheck();

        int[] testArray = {4,1,3,2};

        int result = permCheck.solution(testArray);

        assertEquals(1, result);
    }

}