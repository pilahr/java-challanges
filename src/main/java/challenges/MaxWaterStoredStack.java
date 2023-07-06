package challenges;

import java.util.Stack;

public class MaxWaterStoredStack {

    public static int maxWater(int[] array) {
        Stack<Integer> stack = new Stack<>();

        int result = 0;

        for (int i = 0; i < array.length; i ++) {

            while ((!stack.isEmpty()) && (array[stack.peek()] < array[i])) {

                int popOut = array[stack.peek()];
                stack.pop();

                if (stack.isEmpty())
                    break;

                int distance = i - stack.peek() -1;

                int min_height = Math.min(array[stack.peek()], array[i]) - popOut;

                result += distance * min_height;

            }
            stack.push(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.print(maxWater(arr));
    }
}
