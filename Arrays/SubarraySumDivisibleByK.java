class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        // Create an array to store the count of remainders
        int[] count = new int[k];
        // Initialize the count of remainder 0 to 1 because an empty subarray also has a sum divisible by k
        count[0] = 1;
        
        int sum = 0;
        int result = 0;
        
        // Loop through the nums array
        for (int num : nums) {
            // Calculate the cumulative sum
            sum += num;
            // Ensure sum is non-negative and take its modulo with k to handle negative numbers
            int remainder = (sum % k + k) % k;
            // Increment the result by the count of the current remainder
            result += count[remainder];
            // Increment the count of the current remainder
            count[remainder]++;
        }
        
        return result;

    }
}
