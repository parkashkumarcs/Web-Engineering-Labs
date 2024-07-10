package Week10;

class BinaryRecursive {

    static int binarySearch(int[] arr, int left, int right, int target) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target)
                return mid;
            if (arr[mid] > target)
                return binarySearch(arr, left, mid - 1, target);
            return binarySearch(arr, mid + 1, right, target);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 20, 3, 4, 7, 30 };
        int target = 7;
        int target1 = 10;
        int n = arr.length;

        int result = binarySearch(arr, 0, n - 1, target);
        int result1 = binarySearch(arr, 0, n - 1, target1);
        if (result == -1)
            System.out.println("Element not present in the array");
        else
            System.out.println("Element found at index " + result);
        
        if (result1 == -1)
            System.out.println("Element not present in the array");
        else
            System.out.println("Element found at index " + result);    
    }
}
