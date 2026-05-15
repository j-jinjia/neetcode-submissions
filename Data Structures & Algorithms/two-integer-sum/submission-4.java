class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complementary = new HashMap<>();
        
        for (int i = 0; i < nums.length ; i++){
            int complement = target - nums[i];

            if(complementary.containsKey(complement)) {
                return new int[]{complementary.get(complement), i};
            } 

            complementary.put(nums[i], i);
        }

        return new int[]{};

    }
}
