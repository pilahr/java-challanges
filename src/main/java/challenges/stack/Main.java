package challenges.stack;

import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack <Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(50);
        stack.push(5);

        System.out.println(stack);

       var top = stack.pop();
        System.out.println(top);
        System.out.println(stack);

        top = stack.peek();
        System.out.println(top);


    }
}
