import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NewYearChaosTest {


    @Test
    public void newYearChaosTest(){
        int[] input = {2, 1, 5, 3, 4};
        String output = NewYearChaos.minimumBribes(input);
        assertEquals("5", output);
    }

}