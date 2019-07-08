package codility.timecomplexity;

import java.util.Arrays;

public class PermCheck {



    public int solution(int[] A) {
        int[] copy = new int[A.length];

        for (int number : A) {
            if(number>A.length){
                return 0;
            }
            copy[number] = 1;
        }

        for (int i : copy){
            if (i==0){
                return 0;
            }
        }

        return 1;
    }

    public int solution2(int[] A) {
        int sumExpected = A.length * (A.length + 1) / 2;
        int sumFinal = 0;
        for (int i : A) {
            sumFinal += i;
        }

        if (sumExpected!=sumFinal){
            return 0;
        } else return 1;
    }

}
