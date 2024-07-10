package Week9;

import java.util.Stack;

public class Task5 {

    public static boolean isPalindrome(String str) {
        Stack<Character> stack = new Stack<>();
        int n = str.length();
        
        int i;
        for (i = 0; i < n/2; i++) {
            stack.push(str.charAt(i));
        }
        
        if (n % 2 != 0) {
            i++;
        }
        
        while (i < n) {
            if (stack.empty() || stack.pop() != str.charAt(i)) {
                return false;
            }
            i++;
        }
        
        return true;
    }

    public static void main(String[] args) {
        String obj1 = "radar";
        String obj2 = "hello";
        
        System.out.println(obj1 + " is palindrome? " + isPalindrome(obj1));
        System.out.println(obj2 + " is palindrome? " + isPalindrome(obj2));
    }
}

