import java.util.Scanner;

public class Task2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Enter " + size1 + " values for the first array:");
        for (int i = 0; i < size1; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }
        System.out.print("Enter the size of the second array: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Enter " + size2 + " values for the second array:");
        for (int i = 0; i < size2; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }
        System.out.print("First array: ");
        for (int value : array1) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.print("Second array: ");
        for (int value : array2) {
            System.out.print(value + " ");
        }
        System.out.println();
        int[] array3 = new int[size1 + size2];
        for (int i = 0; i < size1; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < size2; i++) {
            array3[size1 + i] = array2[i];
        }
        System.out.print("The combined elements from array 1 and array 2 stored in array 3 are: ");
        for (int value : array3) {
            System.out.print(value + " ");
        }
        scanner.close();
    }
}
