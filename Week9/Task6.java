package Week9;

import java.util.Stack;

public class Task6 {

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String obj1 = "{[()]}";
        String obj2 = "{[(])}";
        String obj3 = "{[}";
        String obj4 = "}";

        System.out.println(obj1 + " is balanced: " + isBalanced(obj1));
        System.out.println(obj2 + " is balanced: " + isBalanced(obj2));
        System.out.println(obj3 + " is balanced: " + isBalanced(obj3));
        System.out.println(obj4 + " is balanced: " + isBalanced(obj4));
    }
}
