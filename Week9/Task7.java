package Week9;

import java.util.Stack;

public class Task7 {

    public static void sortStack(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();

        while (!stack.isEmpty()) {
            int tmp = stack.pop();

            while (!tempStack.isEmpty() && tempStack.peek() > tmp) {
                stack.push(tempStack.pop());
            }

            tempStack.push(tmp);
        }

        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(2);
        stack.push(7);
        stack.push(1);
        stack.push(3);

        System.out.println("Stack before sorting: " + stack);
        sortStack(stack);
        System.out.println("Stack after sorting: " + stack);
    }
}
