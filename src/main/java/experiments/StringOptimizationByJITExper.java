package experiments;

import java.time.Duration;
import java.time.Instant;

/**
 * Thesis: if I use a loop to create the same String many times the time of execution should be lower
 * then time of execution of a loop that in every iteration creates a unique String.
 * It is because JIT optimizes code with "dead code elimination".
 */
public class StringOptimizationByJITExper {



    public long elapsedTimeAfterCreatingUniqueStringNTimes(int n){
        Instant start = Instant.now();
        creatingUniqueStringNTimes(n);
        Instant finish = Instant.now();
        return Duration.between(start, finish).toMillis();
    }

    public long elapsedTimeAfterCreatingTheSameStringNTimes(int n){
        Instant start = Instant.now();
        creatingTheSameStringNTimes(n);
        Instant finish = Instant.now();
        return Duration.between(start, finish).toMillis();
    }

    private void creatingTheSameStringNTimes(int n) {
        for (int i = 0; i < n; i++) {
            new String("test");
        }

    }

    private void creatingUniqueStringNTimes(int n) {
        for (int i = 0; i < n; i++) {
            new String("test" + i);
        }

    }




}
