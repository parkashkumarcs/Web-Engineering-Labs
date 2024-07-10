package Week10;

public class Factorial{

    public static int factorial(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number);
        System.out.println(result);
    }
}

