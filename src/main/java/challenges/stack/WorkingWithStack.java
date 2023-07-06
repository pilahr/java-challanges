package challenges.stack;

import java.util.Stack;

public class WorkingWithStack {

    public static void main(String[] args) {
        //push
        //pup
        //peek
        //empty
        //search
        // LIFO
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());// top of stack
        System.out.println(stack.size());
        System.out.println(stack.pop());// remove
        System.out.println(stack.size());

        System.out.println(stack.empty());
    }
}
