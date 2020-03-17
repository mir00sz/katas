package codility.leader;

import java.util.Stack;

public class Dominator {

    public int solution(int[] A) {
        // write your code in Java SE 8
        Stack<Integer> stack = new Stack<>();
        for (int elem : A) {
            if (stack.isEmpty() || stack.peek() == elem) {
                stack.push(elem);
            } else {
                stack.pop();
            }
        }

        if (stack.isEmpty()) {
            return -1;
        }

        int candidate = stack.pop();
        int counter = 0;
        int index = -1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == candidate) {
                counter++;
                index = i;
            }
        }

        if (counter > A.length / 2) {
            return index;
        }
        return -1;
    }

}
