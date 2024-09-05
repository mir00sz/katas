package leetcode;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 * Example 2:
 * <p>
 * Input: l1 = [0], l2 = [0]
 * Output: [0]
 * Example 3:
 * <p>
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * Output: [8,9,9,9,0,0,0,1]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in each linked list is in the range [1, 100].
 * 0 <= Node.val <= 9
 * It is guaranteed that the list represents a number that does not have leading zeros.
 */
public class AddTwoNumbers {

    private ListNode result;
    private ListNode current;
    int memory = 0;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            if (memory == 1) {
                current.next = new ListNode(memory);
            }
            return result;
        }
        int sum = nodeValue(l1) + nodeValue(l2) + memory;
        memory = 0;
        if (sum - 10 >= 0) {
            sum = sum - 10;
            memory = 1;
        }
        if (result == null) {
            result = new ListNode(sum);
            current = result;
        } else {
            ListNode newCurrent = new ListNode(sum);
            current.next = newCurrent;
            current = newCurrent;
        }
        return addTwoNumbers(nextOrNull(l1), nextOrNull(l2));
    }

    private ListNode nextOrNull(ListNode n) {
        return n == null ? null : n.next;
    }

    private int nodeValue(ListNode node) {
        if (node == null) {
            return 0;
        }
        return node.val;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
}
