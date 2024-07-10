package Week10;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number N to generate Fibonacci series: ");
        int N = scanner.nextInt();
        scanner.close();

        int a = 0, b = 1, c;
        System.out.print(a + " " + b + " ");

        for (int i = 2; i < N; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
