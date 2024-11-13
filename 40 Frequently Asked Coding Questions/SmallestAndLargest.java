public class FindLargestAndSmallest {
    public static void findLargestAndSmallest(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        // Initialize largest and smallest with the first element
        int largest = arr[0];
        int smallest = arr[0];

        // Traverse the array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i]; // Update largest if necessary
            } 
            if (arr[i] < smallest) {
                smallest = arr[i]; // Update smallest if necessary
            }
        }

        // Print results
        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 20, 15};
        findLargestAndSmallest(arr); // Outputs: Largest element: 20, Smallest element: 5
    }
}
