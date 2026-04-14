class Solution {
    public boolean divideArray(int[] nums) {
        //Brute force;

        if (nums.length % 2 != 0) {
            return false;
        }

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                continue;
            }
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] ){
                    nums[i] = 0;
                    nums[j] = 0;
                    break;
                }
            }
        }

        for(int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                return false;
            }
        }

        return true;
    }
}