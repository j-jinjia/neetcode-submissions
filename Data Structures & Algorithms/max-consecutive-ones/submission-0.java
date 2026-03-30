class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int length = nums.length;
        int maxConsecutive = 0;
        int currentCount = 0;
        for(int i = 0; i < length; i++){
            if(nums[i] == 1){
                currentCount++;
                if(currentCount > maxConsecutive){
                    maxConsecutive = currentCount;
                }
            }else{
                currentCount = 0;
            }
        }
        return maxConsecutive;
    }
}