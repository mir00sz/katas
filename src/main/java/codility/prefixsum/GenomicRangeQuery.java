package codility.prefixsum;

public class GenomicRangeQuery {

    public int[] solution(String S, int[] P, int[] Q) {
        // write your code in Java SE 8

        int[] aOccurances = new int[S.length() + 1];
        int[] cOccurances = new int[S.length() + 1];
        int[] gOccurances = new int[S.length() + 1];
        int[] result = new int[P.length];



        short a, c, g;
        for (int i = 0; i < S.length(); i++){
            a=0;
            c=0;
            g=0;
            int occurancesIndex = i+1;

            if (S.charAt(i)=='A') {
                a=1;
            } else if (S.charAt(i)=='C') {
                c=1;
            } else if (S.charAt(i)=='G') {
                g=1;
            }

            aOccurances[occurancesIndex] = aOccurances[i]+a;
            cOccurances[occurancesIndex] = cOccurances[i]+c;
            gOccurances[occurancesIndex] = gOccurances[i]+g;
        }


        for (int i = 0; i < P.length; i++) {
            int bottomIndex = P[i];
            int topIndex = Q[i] + 1;
            if (aOccurances[topIndex] - aOccurances[bottomIndex] > 0) {
                result[i] = 1;
            } else if (cOccurances[topIndex] - cOccurances[bottomIndex] > 0) {
                result[i] = 2;
            } else if (gOccurances[topIndex] - gOccurances[bottomIndex] > 0) {
                result[i] = 3;
            } else {
                result[i] = 4;
            }
        }

        return result;

    }
}
