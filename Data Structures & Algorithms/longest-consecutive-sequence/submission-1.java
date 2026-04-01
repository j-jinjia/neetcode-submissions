class Solution {
    public int longestConsecutive(int[] nums) {
        int maxConsecutiveCount = 0;
        int currentConsecutiveCount = 1;
        int currentNumber = 0;
        Set<Integer> count = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            count.add(nums[i]);
        }


        for (int i = 0; i < nums.length; i++) {
            if(!count.contains(nums[i] - 1)){

            currentNumber = nums[i];
            currentConsecutiveCount = 1;
            while(count.contains(currentNumber + 1)){
                currentNumber++;
                currentConsecutiveCount++;
            }
            maxConsecutiveCount = Math.max(currentConsecutiveCount, maxConsecutiveCount);
            }
        }

        return maxConsecutiveCount;
    }
}
