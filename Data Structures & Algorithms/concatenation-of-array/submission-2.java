class Solution {
    public int[] getConcatenation(int[] nums) {
        int p1 = 0;
        int p2 = nums.length;
        int[] numsDouble = new int[nums.length * 2];

        for(int num : nums ) {
            numsDouble[p1] = num;
            numsDouble[p2] = num;

            p1++;
            p2++;
        }
        return numsDouble;
    }
}