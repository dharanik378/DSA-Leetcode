public class QuickSort {

    // Main quicksort function
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Find pivot index
            int pi = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, pi - 1);  // Before pivot
            quickSort(arr, pi + 1, high); // After pivot
        }
    }

    // Partition function to arrange elements around pivot
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // Pivot element (we choose the last element)
        int i = (low - 1);  // Pointer for the smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to the pivot
            if (arr[j] <= pivot) {
                i++;  // Increment index for smaller element
                swap(arr, i, j);  // Swap elements
            }
        }

        // Swap the pivot element with the element at index i + 1
        swap(arr, i + 1, high);

        return i + 1;  // Return the pivot index
    }

    // Swap utility function
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Utility function to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method to test the quicksort
    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Original array:");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);  // Sort the array

        System.out.println("Sorted array:");
        printArray(arr);  // Print the sorted array
    }
}
