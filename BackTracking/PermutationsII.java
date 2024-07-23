class Solution {

    int n;
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> curr=new ArrayList<>();
    List<Integer> idx=new ArrayList<>();

    public void helper(int[] nums){
        if(curr.size()==nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<n;i++){
            if(idx.contains(i)){
                continue;
            }
            if (i > 0 && nums[i] == nums[i - 1] && !idx.contains(i - 1)) {
                continue;
            }
            curr.add(nums[i]);
            idx.add(i);
            helper(nums);
            curr.remove(curr.size()-1);
            idx.remove(idx.size()-1);
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        n=nums.length;
        Arrays.sort(nums);
        helper(nums);
        return res;   
    }
}
