package experiments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringOptimizationByJITExperTest {


    @Test
    public void elapsedTimeForSameStringShouldBeShorterThenForUniqueString() {
        StringOptimizationByJITExper experiment = new StringOptimizationByJITExper();
        int n = 10_000_000_00;
//        float c = Nota;

        long elapsedTimeForSameString = experiment.elapsedTimeAfterCreatingTheSameStringNTimes(n);
        long elapsedTimeForUniqueString = experiment.elapsedTimeAfterCreatingUniqueStringNTimes(n);
        System.out.println("same string: " + elapsedTimeForSameString);
        System.out.println("unique string: " + elapsedTimeForUniqueString);

        assertTrue(elapsedTimeForUniqueString > elapsedTimeForSameString, "tst");
    }

}