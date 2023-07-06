package challenges.queue;

import java.util.Arrays;
import java.util.Stack;

public class BuildingQueueUsingStack {

    private static Stack<Integer> stack1 = new Stack<>();
    private static Stack<Integer> stack2 = new Stack<>();


    //O(1)
    private static void enqueue(int item) {
        stack1.push(item);
    }

    // O(n)
    public static int dequeue() {

        if (stack1.isEmpty() && stack2.isEmpty()) {
            throw new IllegalStateException();
        }
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }


    public static void main(String[] args) {
        BuildingQueueUsingStack queue = new BuildingQueueUsingStack();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        var first = queue.dequeue();
        System.out.println(first);


    }
}
