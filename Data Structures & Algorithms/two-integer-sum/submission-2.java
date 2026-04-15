class Solution {
    public int[] twoSum(int[] nums, int target) {
        //optimized
        //Compute the complementary where complementary = target - current Index number.
        //Add to map (Number, Index);
        //Loop through array and check if complementary of current num exists. 
        //if so , return current num index and compelemtnary index

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complementary = target - nums[i];
            if(map.containsKey(complementary)) {
                return new int[]{map.get(complementary), i};
            } else{
                map.put(nums[i], i);
            }
            System.out.println(map.get(complementary));
        }

        return new int[]{};
    }
}
