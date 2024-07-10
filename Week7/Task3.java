import java.util.HashMap;
import java.util.Map;

public class Task3{
    public static void main(String[] args) {
        int[] array = {21, 9, 17, 43, 9, 15, 21, 6, 38, 6};
        System.out.print("Array values are: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
        Map<Integer, Integer> valueCounts = new HashMap<>();
        for (int value : array) {
            valueCounts.put(value, valueCounts.getOrDefault(value, 0) + 1);
        }
        int duplicateCount = 0;
        for (int count : valueCounts.values()) {
            if (count > 1) {
                duplicateCount++;
            }
        }
        System.out.println("The count of duplicate values is: " + duplicateCount);
    }
}
