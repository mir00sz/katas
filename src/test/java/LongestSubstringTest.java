import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringTest {



    @Test
    void longestSubstring(){

        String input1 = "";
        String input2 = "aaabc";
        String input3 = "abbDDDeeeeeeeee";
        String input4 = "aabbbbbbbbbccc";

        LongestSubstring longestSubstring = new LongestSubstring();

        int[] shouldBe1 = new int[]{-1, 0};
        int[] shouldBe2 = new int[]{0, 3};
        int[] shouldBe3 = new int[]{6, 9};
        int[] shouldBe4 = new int[]{2, 9};

        int[] result1 = longestSubstring.substring(input1);
        int[] result2 = longestSubstring.substring(input2);
        int[] result3 = longestSubstring.substring(input3);
        int[] result4 = longestSubstring.substring(input4);



        assertTrue(Arrays.equals(shouldBe1,result1),"Should be: "
                + Arrays.toString(shouldBe1)
                + " But there is: "
                + Arrays.toString(result1));

        assertTrue(Arrays.equals(shouldBe2,result2),"Should be: "
                + Arrays.toString(shouldBe2)
                + " But there is: "
                + Arrays.toString(result2));
        assertTrue(Arrays.equals(shouldBe3,result3),"Should be: "
                + Arrays.toString(shouldBe3)
                + " But there is: "
                + Arrays.toString(result3));
        assertTrue(Arrays.equals(shouldBe4,result4),"Should be: "
                + Arrays.toString(shouldBe4)
                + " But there is: "
                + Arrays.toString(result4));

    }

}