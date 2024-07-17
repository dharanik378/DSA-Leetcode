/*Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]*/
class Solution {
    public static int[] moveZeroes(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[count++]=nums[i];
            }
        }
        while(count<n){
            nums[count]=0;
            count++;
        }
        return nums;
        // 1 2 0 6 0 7
    }
    
}
