public class Task8{
    public static void main(String[] args) {
        int[][] array = {
            {3, 7, 2},
            {8, 4, 1},
            {5, 9, 6}
        };
        System.out.println("Original array values are:");
        printArray(array);
        int[][] flippedArray = flipVertically(array);
        System.out.println("Vertically flipped array is:");
        printArray(flippedArray);
    }

    public static int[][] flipVertically(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;
        int[][] flippedArray = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                flippedArray[i][j] = array[rows - 1 - i][j];
            }
        }
        return flippedArray;
    }
    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
