package codility.timecomplexity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TapeEquilibriumTest {




    @Test
    void tapeEquilibriumTest(){

        int[] A = {-10, -20, -30, -40, 100};
        TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
        int result = tapeEquilibrium.solution(A);
        assertEquals(20, result);
    }

}