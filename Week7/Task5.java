import java.util.HashMap;
import java.util.Map;

public class Task5{
    public static void main(String[] args) {
        int[] array = {22, 9, 4, 4, 22, 2};
        System.out.print("Array values are: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int value : array) {
            frequencyMap.put(value, frequencyMap.getOrDefault(value, 0) + 1);
        }
        System.out.println("The frequency of all elements of the array are:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
        }
    }
}
