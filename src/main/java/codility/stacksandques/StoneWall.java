package codility.stacksandques;

import java.util.Stack;

public class StoneWall {

    public int solution(int[] H) {
        int noOfBlocks = H.length;
        if (noOfBlocks == 0 || noOfBlocks == 1) {
            return noOfBlocks;
        }

        Stack<Integer> blocks = new Stack<>();
        for (int height : H) {
            if (blocks.empty() || blocks.peek() < height) {
                blocks.push(height);
            } else if (blocks.peek() == height) {
                noOfBlocks--;
            } else {
                while (!blocks.isEmpty() && height < blocks.peek()) {
                    blocks.pop();
                }
                if (!blocks.isEmpty() && blocks.peek() == height) {
                    noOfBlocks--;
                } else {
                    blocks.push(height);
                }
            }
        }

        return noOfBlocks;
    }
}
