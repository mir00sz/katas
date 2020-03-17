package codility.stacksandques;

import java.util.Stack;

public class Fish {

    public int solution(int[] A, int[] B) {

        Stack<Integer> stack = new Stack<>();
        int survived = 0;

        for (int i = 0; i < A.length; i++) {

            if (stack.isEmpty()) {
                if (B[i] == 1) {
                    stack.push(i);
                } else {
                    survived++;
                }
            } else {
                if (B[i] == 1) {
                    stack.push(i);
                } else {
                    while (!stack.isEmpty() && A[i] > A[stack.peek()]) {
                        stack.pop();
                    }

                    if (stack.isEmpty()) {
                        survived++;
                    }

                }
            }

        }

        return survived + stack.size();
    }
}
