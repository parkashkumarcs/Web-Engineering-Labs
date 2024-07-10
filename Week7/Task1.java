import java.util.Scanner;

public class Task1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] originalArray = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            originalArray[i] = scanner.nextInt();
        }
        System.out.print("Original array: ");
        for (int value : originalArray) {
            System.out.print(value + " ");
        }
        System.out.println();
        int[] reversedArray = new int[size];
        for (int i = 0; i < size; i++) {
            reversedArray[i] = originalArray[size - 1 - i];
        }
        System.out.print("Reversed array: ");
        for (int value : reversedArray) {
            System.out.print(value + " ");
        }
        scanner.close();
    }
}
