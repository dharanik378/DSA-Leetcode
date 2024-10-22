// Permutations in array
// Difficulty: EasyAccuracy: 60.7%Submissions: 27K+Points: 2
// Given two arrays arr1[], arr2[], and an integer k. The task is to check if after permuting both arrays in such a way, we get the sum of their corresponding 
//element greater than or equal to k i.e. arr1i + arr2i >= k for all i (from 0 to n-1). Return true if possible, else false. 

// Examples:

// Input: k = 10, arr1[] = [2, 1, 3], arr2[] = [7, 8, 9]. 
// Output: true
// Explanation: Permutation  arr1[] = [1, 2, 3] and arr2[] = [9, 8, 7] satisfy the condition arr1[i] + arr2[i] >= k
// Input: k = 5, arr1[] = [1, 2, 2, 1], arr2[] = [3, 3, 3, 4].
// Output: false
// Explanation: Since any permutation won't give the answer.
// Expected Time Complexity: O(n*log(n))
// Expected Auxiliary Space: O(1)

// Constraints:
// 1 ≤ arr.size() ≤ 105
// 0 ≤ k ≤ 105
// 0 ≤ arr1i, arr2i ≤ 2*105

// To solve this problem, the idea is to sort one of the arrays in ascending order and the other in descending order. By pairing the smallest element of one array with the largest element of the other, 
//we maximize the sum of their corresponding elements. If, after pairing and summing, each sum is greater than or equal to 𝑘
// k, we return true; otherwise, we return false.

import java.util.Arrays;

public class PermutationCheck {
    public static boolean isPossible(int[] arr1, int[] arr2, int k) {
        // Sort arr1 in ascending order
        Arrays.sort(arr1);

        // Sort arr2 in descending order
        Arrays.sort(arr2);
        int n = arr2.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr2[i];
            arr2[i] = arr2[n - i - 1];
            arr2[n - i - 1] = temp;
        }

        // Check if sum of each pair is greater than or equal to k
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] + arr2[i] < k) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 1, 3};
        int[] arr2 = {7, 8, 9};
        int k = 10;
        System.out.println(isPossible(arr1, arr2, k)); // Output: true

        int[] arr3 = {1, 2, 2, 1};
        int[] arr4 = {3, 3, 3, 4};
        int k2 = 5;
        System.out.println(isPossible(arr3, arr4, k2)); // Output: false
    }
}
