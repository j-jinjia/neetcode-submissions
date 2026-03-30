class Solution {
    public boolean canPermutePalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(Character c: s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int frequency = 0;

        for(Integer value:map.values()){
            if(value % 2 != 0){
                frequency++;
            }
        }
        if(s.length() % 2 == 0){
            return frequency == 0;
        }else {
            return frequency <=1;
        }

    }
}
