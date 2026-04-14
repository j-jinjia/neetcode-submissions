class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> distinctIntegers1 = new ArrayList<>();
        List<Integer> distinctIntegers2 = new ArrayList<>();

        Set<Integer> uniqueNums1 = new HashSet<>();
        Set<Integer> uniqueNums2 = new HashSet<>();

        for(int i = 0; i < nums1.length ; i++) {
            uniqueNums1.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length ; i++) {
            uniqueNums2.add(nums2[i]);
        }
        
        for(int value : uniqueNums1) {
            if(!uniqueNums2.contains(value)) {
                distinctIntegers1.add(value);
            }
        }
        for(int value : uniqueNums2) {
            if(!uniqueNums1.contains(value)) {
                distinctIntegers2.add(value);
            }
        }
        answer.add(distinctIntegers1);
        answer.add(distinctIntegers2);        
        return answer;

        
    }
}