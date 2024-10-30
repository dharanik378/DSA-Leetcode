/*
Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.
Return the sum of the three integers.
You may assume that each input would have exactly one solution.
Example 1:

Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
Example 2:

Input: nums = [0,0,0], target = 1
Output: 0
Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).
 

Constraints:

3 <= nums.length <= 500
-1000 <= nums[i] <= 1000
-104 <= target <= 104
*/

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        int closest=Integer.MAX_VALUE;
        int closestsum=Integer.MAX_VALUE;
        for(int i=0;i<n-2;i++)
        {
            for(int j=i+1;j<n-1;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    int sum=nums[i]+nums[j]+nums[k];
                    int close=Math.abs(sum-target);
                    if(close<closest)
                    {
                        closest=close;
                        closestsum=sum;
                    }
                }
            }
        }
        return closestsum;

        
    }
}