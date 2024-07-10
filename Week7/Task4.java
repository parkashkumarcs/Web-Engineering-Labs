import java.util.LinkedHashSet;

public class Task4{
    public static void main(String[] args) {
        int[] originalArray = {21, 9, 17, 43, 9, 15, 21, 6, 38, 6};
        System.out.print("Original array values are: ");
        for (int value : originalArray) {
            System.out.print(value + " ");
        }
        System.out.println();
        LinkedHashSet<Integer> uniqueValues = new LinkedHashSet<>();
        for (int value : originalArray) {
            uniqueValues.add(value);
        }
        int[] newArray = new int[uniqueValues.size()];
        int index = 0;
        for (int value : uniqueValues) {
            newArray[index++] = value;
        }
        System.out.print("New array values after removing duplicates are: ");
        for (int value : newArray) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println("Size of the original array: " + originalArray.length);
        System.out.println("Size of the new array: " + newArray.length);
    }
}
