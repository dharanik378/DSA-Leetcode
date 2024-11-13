public class MergeSort {

    public static void mergeSort(int[] arr) {
        if (arr.length < 2) {
            return;  // Base case: if array has one element, it's already sorted
        }
        
        int mid = arr.length / 2;  // Find the middle index
        int[] left = new int[mid];  // Left sub-array
        int[] right = new int[arr.length - mid];  // Right sub-array

        System.arraycopy(arr, 0, left, 0, mid);  // Copy first half into left
        System.arraycopy(arr, mid, right, 0, arr.length - mid);  // Copy second half into right
        
        mergeSort(left);  // Recursively sort the left sub-array
        mergeSort(right);  // Recursively sort the right sub-array

        merge(arr, left, right);  // Merge the sorted sub-arrays
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Merge the two sub-arrays (left and right)
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];  // Add smaller element to the main array
            } else {
                arr[k++] = right[j++];  // Add smaller element to the main array
            }
        }

        // Copy remaining elements from left (if any)
        while (i < left.length) {
            arr[k++] = left[i++];
        }

        // Copy remaining elements from right (if any)
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Original array:");
        printArray(arr);

        mergeSort(arr);  // Sort the array

        System.out.println("Sorted array:");
        printArray(arr);  // Print the sorted array
    }
}
