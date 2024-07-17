class Solution {
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int n = nums.length;
        
        // Populate the hashmap with the frequency of each element
        for (int num : nums) {
            if (countMap.containsKey(num)) {
                countMap.put(num, countMap.get(num) + 1);
            } else {
                countMap.put(num, 1);
            }
        }
        
        // Find the element that appears more than n / 2 times
        for (int key : countMap.keySet()) {
            if (countMap.get(key) > n / 2) {
                return key;
            }
        }
        
        // Since the problem guarantees that a majority element always exists,
        // we should never reach this line. But return a default value just in case.
        return -1;
    }
}
