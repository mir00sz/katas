package leetcode;


/**
 * Given an array nums of integers, return how many of them contain an even number of digits.
 * Example1
 * Input: nums = [12,345,2,6,7896]
 * Output: 2
 * Explanation:
 * 12 contains 2 digits (even number of digits).
 * 345 contains 3 digits (odd number of digits).
 * 2 contains 1 digit (odd number of digits).
 * 6 contains 1 digit (odd number of digits).
 * 7896 contains 4 digits (even number of digits).
 * Therefore only 12 and 7896 contain an even number of digits.
 * Example 2
 * Input: nums = [555,901,482,1771]
 * Output: 1
 * Explanation:
 * Only 1771 contains an even number of digits.
 * Constraints:
 * 1 <= nums.length <= 500
 * 1 <= nums[i] <= 105
 */

public class NumbersWithEvenNumberOfDigits {

    public int findNumbers(int[] nums) {
        int counter = 0;
        for(int number : nums) {
            boolean isEven = true;
            while(number>0) {
                number=number/10;
                isEven = !isEven;
            }
            if(isEven) {
                counter++;
            }
        }
        return counter;
    }
}

/**
 * This solution has time complexity of O(N log_10 M) where M is the number with the largest number of digits
 * Better approach is:
 * Constraint says 1≤nums[i]≤10^5
 * So:
 * 1⇝9 have 1, hence an odd number of digits.
 * 10⇝99 have 2, hence an even number of digits.
 * 100⇝999 have 3, hence an odd number of digits.
 * 1000⇝9999 have 4, hence an even number of digits.
 * 10000⇝99999 have 5, hence an odd number of digits.
 * 100000 has 6, hence an even number of digits.
 *
 * class Solution {
 *     public int findNumbers(int[] nums) {
 *         // Counter to count the number of even digit integers
 *         int evenDigitCount = 0;
 *
 *         for (int num : nums) {
 *             if ((num >= 10 && num <= 99) || (num >= 1000 && num <= 9999) || num == 100000)
 *                 evenDigitCount++;
 *         }
 *
 *         return evenDigitCount;
 *     }
 * }
 */
