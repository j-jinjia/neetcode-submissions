class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();

        int totalPairs = 0;
        for (int i = 0; i < nums.length ; i++) {
            totalPairs += count.getOrDefault(nums[i], 0);
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1); 
        } 

        return totalPairs;
    }
}