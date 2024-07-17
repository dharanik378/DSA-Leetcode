// Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
// Notice that the solution set must not contain duplicate triplets.
// Example 1:
// Input: nums = [-1,0,1,2,-1,-4]
// Output: [[-1,-1,2],[-1,0,1]]
// Explanation: 
// nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
// nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
// nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
// The distinct triplets are [-1,0,1] and [-1,-1,2].
// Notice that the order of the output and the order of the triplets does not matter.

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        // Sorting the array to easily skip duplicates
        Arrays.sort(nums);
        
        // Iterate through the array
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicates
            
            //fixing the first element
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            // Initialize left and right pointers
            int left = i + 1;
            int right = nums.length - 1;
            
            // Two-pointer approach to find triplets that sum up to 0
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    // Found a triplet, add it to the result
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Skip duplicates
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    
                    // Move pointers
                    left++;
                    right--;
                } else if (sum < 0) {
                    // Sum is less than 0, move left pointer to increase sum
                    // because the array is sorted, increment left pointer to move the sum closer to zero
                    left++;
                } else {
                    // Sum is greater than 0, move right pointer to decrease sum
                    right--;
                }
            }
        }
        
        return result;
    }
    
}
