class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //Brute force solution:
        //Given that arrays are already sorted, we can insert nums from nums2 into the 0 nums
        //in nums1 by using m(index where 0 nums starts.)
 
        for (int i = 0; i < nums2.length; i++) {
            nums1[m + i] = nums2[i]; 
        }

        Arrays.sort(nums1);
    }
}