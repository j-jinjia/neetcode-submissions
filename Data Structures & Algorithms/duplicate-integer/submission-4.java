class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> uniqueNums = new HashSet<>();

        for(Integer num : nums) {
            if(uniqueNums.contains(num)) {
                return true;
            } 
            uniqueNums.add(num);
        }
        return false;
    }
}