package codility.stacksandques;

import java.util.Stack;

public class Nesting {

    public int solution(String S) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < S.length(); i++) {
            char currentChar = S.charAt(i);
            if (currentChar == '(') {
                stack.push(currentChar);
            } else {
                if (stack.isEmpty()) {
                    return 0;
                } else {
                    stack.pop();
                }
            }
        }

        if (!stack.isEmpty()) {
            return 0;
        }

        return 1;

    }
}
