class Solution {
    public int twoSumLessThanK(int[] nums, int k) {
        Arrays.sort(nums);
        int p1 = 0;
        int p2 = nums.length - 1;
        int sum = 0;
        int result = -1;

        while (p1 < p2) {
            sum = nums[p1] + nums[p2];

            if (sum < k) {
                result = Math.max(sum, result);
                p1++;
            }else {
                p2--;
            }

        }
        return result;
    }
} 
