package codility.countingelements;

public class MissingInteger {


    public int solution(int[] A) {
        // write your code in Java SE 8
        int[] counters = new int[1000000];
        for (int value : A) {
            if (value > 0) {
                counters[value - 1]++;
            }

        }

        for (int i =0; i< counters.length; i++){
            if(counters[i]==0){
                return i+1;
            }
        }

        return -1;
    }
}
