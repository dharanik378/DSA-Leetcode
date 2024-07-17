class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        
        // Traverse through the array
        for (int num : nums) {
            // Get the index of the current number (since numbers are in the range [1, n])
            int index = Math.abs(num) - 1;
            // If the number at that index is negative, it means we've encountered it before
            if (nums[index] < 0)
                result.add(Math.abs(num)); // Add it to the result list
            else
                nums[index] = -nums[index]; // Mark the number as seen by making it negative
        }
        
        return result;
    }
}
