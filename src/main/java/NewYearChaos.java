import java.util.stream.IntStream;

/**
 * Solution for New Year Chaos task from Hacker Rank:
 * https://www.hackerrank.com/challenges/new-year-chaos/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
 */
public class NewYearChaos {



    static String minimumBribes(int[] q) {

        int totalNumberOfSteps = 0;
        final int maxNoOfSteps = 2;
        int[] indeces = IntStream.range(1, q.length+1).toArray();

        for(int i = 0; i< q.length - 1; i++){
            if(q[i] > indeces[i]){
                int numberOfOnePersonsSteps = indeces[q[i]-1] - i;
                if(numberOfOnePersonsSteps > maxNoOfSteps){
                    //System.out.println("Too chaotic");
                    return "Too chaotic";
                }
                for (int j = numberOfOnePersonsSteps; j > 0; j--){
                    indeces[i+j]++;
                }

                totalNumberOfSteps = totalNumberOfSteps + numberOfOnePersonsSteps;
            }
        }
        //System.out.println(totalNumberOfSteps);
        return String.valueOf(totalNumberOfSteps);

    }


}
