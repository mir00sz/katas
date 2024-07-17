public class LongestSubstring2 {


    public int[] substring(String input1) {
        int[] result = new int[2];
        if (input1.length() == 0) {
            return new int[]{-1,0};
        } else if (input1.length() == 1) {
            result = new int[]{0, 1};
            return result;
        }


        int longestLength = 0;
        int longestIndex = 0;

        int currentLength = 1;
        int currentIndex = 0;
        char prevChar = input1.charAt(0);

        for (int i = 1; i < input1.length(); i++) {
            char currentChar = input1.charAt(i);

            if(prevChar==currentChar && i == input1.length()-1) {
                currentLength++;
                if (currentLength>longestLength) {
                    longestLength=currentLength;
                    result[0] = currentIndex;
                    result[1] = longestLength;
                    return result;
                }

            }

            if (currentChar == prevChar) {
                currentLength++;
            } else {
                if (currentLength > longestLength) {
                    longestLength = currentLength;
                    longestIndex = currentIndex;
                }
                currentIndex = i;
                currentLength = 1;
            }
            prevChar = currentChar;
        }

        result[0]=longestIndex;
        result[1]=longestLength;
        return result;
    }

}
