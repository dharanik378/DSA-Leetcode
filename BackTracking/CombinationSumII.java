class Solution{
  public void rec(int[] arr, int target, int idx, List<List<Integer>> ans, List<Integer> list) {
        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }
        
        for (int i = idx; i < arr.length; i++) {
            if (i > idx && arr[i] == arr[i - 1]) {
                continue; // Skip duplicates
            }
            if (arr[i] <= target) {
                list.add(arr[i]);
                rec(arr, target - arr[i], i + 1, ans, list); // Move to the next index
                list.remove(list.size() - 1);
            }
        }
    }
  public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates); // Sort to handle duplicates
        rec(candidates, target, 0, ans, list);
        return ans;
    }
}
