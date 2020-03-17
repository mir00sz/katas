package codility.countingelements;

public class MaxCounters {


    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int[] counters = new int[N];
        int maxVal = 0;
        int baseForCounters = 0;
        for (int value : A) {
            int counterIndex = value - 1;
            if (value > N) {
                baseForCounters = maxVal;

            } else {
                if (counters[counterIndex] >= baseForCounters) {
                    counters[counterIndex]++;
                } else {
                    counters[counterIndex] = baseForCounters + 1;
                }


                if (counters[counterIndex] > maxVal) {
                    maxVal = counters[counterIndex];
                }
            }
        }

        for (int i = 0; i < counters.length; i++) {
            if (counters[i] < baseForCounters) {
                counters[i] = baseForCounters;
            }
        }
        return counters;
    }

}
