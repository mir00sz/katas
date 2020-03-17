package codility.stacksandques;

import java.util.Stack;

public class Brackets {

    public int solution(String S) {


        if (S.length() == 0) {
            return 1;
        }


        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (isOpenning(c)) {
                stack.push(c);
            } else if (stack.isEmpty()) {
                return 0;
            } else {
                if (isSame(stack.peek(), c)) {
                    stack.pop();
                } else return 0;
            }
        }

        if (stack.isEmpty()) {
            return 1;
        } else {
            return 0;
        }


    }

    private boolean isSame(char prev, char curr) {
        return (curr == ')' && prev == '(') ||
                (curr == '}' && prev == '{') ||
                (curr == ']' && prev == '[');

    }

    private boolean isOpenning(char c) {
        return c == '(' || c == '{' || c == '[';
    }
}
