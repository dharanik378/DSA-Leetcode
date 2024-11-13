public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Calculate the middle index

            if (arr[mid] == target) {
                return mid; // Target found at index mid
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 10, 14, 20, 25}; // Sorted array
        int target = 10;
        int result = binarySearch(arr, target);

        if (result == -1) {
            System.out.println("Target not found in array");
        } else {
            System.out.println("Target found at index: " + result);
        }
    }
}
