/**
 * A unified substring is defined as a sequence of the same characters that are a part of some String.
 * I.e. in the String: aaaabbcccffaaaaaaaa there are the following substrings:
 *
 * aaaa
 * bb
 * ccc
 * f
 * aaaaaaaa
 *
 *
 * Write a method that finds an index and a length of the longest unified substring in a given String.
 */

public class LongestSubstring {


    public int[] substring(String input1) {
        int longestSubstringIdx = -1;
        int longestSubstringLength = 0;

        if (input1.length() != 0) {


            char beforeChar = input1.charAt(0);
            int tempLongestSubstringIndex = 0;
            int substringLength = 1;

            for (int i = 1; i < input1.length(); i++) {
                char actualChar = input1.charAt(i);
                if (actualChar == beforeChar) {
                    substringLength++;
                } else {
                    tempLongestSubstringIndex = i;
                    substringLength=1;
                }

                if (substringLength > longestSubstringLength) {
                    longestSubstringIdx = tempLongestSubstringIndex;
                    longestSubstringLength = substringLength;
                }
                beforeChar = actualChar;
            }
        }

        return new int[]{longestSubstringIdx,longestSubstringLength};
    }
}
