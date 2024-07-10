package Week10;

import java.util.Stack;

public class Task4 {
    public static void insertAtBottom(Stack<Integer> stack, int item) {
        if (stack.isEmpty()) {
            stack.push(item);
        } else {
            int top = stack.pop();
            insertAtBottom(stack, item);
            stack.push(top);
        }
    }
    public static void reverseStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int top = stack.pop();
            reverseStack(stack);
            insertAtBottom(stack, top);
        }
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Original Stack: " + stack);

        reverseStack(stack);

        System.out.println("Reversed Stack: " + stack);
    }
}

