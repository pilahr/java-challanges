package challenges.stack;

import java.beans.Expression;
import java.util.Stack;

public class BalanceExpression {

    public static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch:input.toCharArray()) {
            if (ch == '(' || ch == '<'|| ch == '[' || ch == '{') {
                stack.push(ch);
            }
            if (ch == ')' || ch == '>'|| ch == ']' || ch == '}') {
                if (stack.empty()) return false;
                var top = stack.pop();

                if ((ch == ')' && top != '(')
                        || (ch == '>' && top != '<')
                        || (ch == ']' && top != '[')
                        || (ch == '}' && top != '{')){
                    return false;
                }
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        String str = "(1+2)";
        String str2 = "((1+2)";
        String str3 = ")1+2("; // empty stack
        String str4 = "(1+2]";
        System.out.println(isBalanced(str));
        System.out.println(isBalanced(str2));
        System.out.println(isBalanced(str3));
        System.out.println(isBalanced(str4));



    }
}
