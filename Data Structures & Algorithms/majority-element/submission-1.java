class Solution {
    public int majorityElement(int[] nums) {
        int currentMax = 0;
        int max = 0;
        Map<Integer, Integer> counter = new HashMap<>(); 
        for (int i = 0; i < nums.length; i++) {
            counter.put(nums[i], counter.getOrDefault(nums[i], 0) + 1);

            if(counter.get(nums[i]) > currentMax) {
                max = nums[i];
                currentMax = counter.get(nums[i]);
            }
        }
        return max;
    }
}