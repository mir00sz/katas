package leetcode;

import leetcode.AddTwoNumbers.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {

    public static Stream<Arguments> params() {
        return Stream.of(
                Arguments.of(
                    new int[]{2,4,9}, new int[]{5,6,4,9}, new int[]{7,0,4,0,1}),
                Arguments.of(new int[]{0}, new int[]{0}, new int[]{0}),
                Arguments.of(new int[]{9,9,9,9,9,9,9}, new int[]{9,9,9,9}, new int[]{8,9,9,9,0,0,0,1})
        );
    }

    @ParameterizedTest
    @MethodSource("params")
    void shouldAddTwoNumbers(int[] l1, int[] l2, int[] expected) {
        ListNode l1Node = toListNode(l1);
        ListNode l2Node = toListNode(l2);
        AddTwoNumbers solution = new AddTwoNumbers();
        ListNode result = solution.addTwoNumbers(l1Node, l2Node);
        assertTest(expected, result);

    }

    private void assertTest(int[] expected, ListNode result) {
        ListNode current = result;
        for (int el : expected) {
            assertEquals(el, current.val);
            current = current.next;
        }
    }

    private ListNode toListNode(int[] l1) {
        ListNode result = new ListNode(l1[0]);
        ListNode current = result;
        for (int i = 1; i < l1.length; i++) {
            current.next = new ListNode(l1[i]);
            current = current.next;

        }
        return result;
    }
}