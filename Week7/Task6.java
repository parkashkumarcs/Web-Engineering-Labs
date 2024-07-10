public class Task6{
    public static void main(String[] args) {
        int[][] array1 = {
            {4, 7, 2},
            {2, 6, 5},
            {9, 3, 1}
        };

        int[][] array2 = {
            {3, 7, 2},
            {8, 4, 1},
            {5, 9, 6}
        };

        System.out.println("Case 1:");
        printArray(array1);
        checkRowMagic(array1);

        System.out.println("Case 2:");
        printArray(array2);
        checkRowMagic(array2);
    }

    public static void printArray(int[][] array) {
        System.out.println("Array values are:");
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void checkRowMagic(int[][] array) {
        int sum = 0;
        boolean isRowMagic = true;
        for (int value : array[0]) {
            sum += value;
        }

        for (int i = 1; i < array.length; i++) {
            int rowSum = 0;
            for (int value : array[i]) {
                rowSum += value;
            }
            if (rowSum != sum) {
                isRowMagic = false;
                break;
            }
        }
        if (isRowMagic) {
            System.out.println("The array is Row-Magic");
        } else {
            System.out.println("The array is not Row-Magic");
        }
    }
}
