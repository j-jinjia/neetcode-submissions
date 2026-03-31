class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> tToS = new HashMap<>();
        Map<Character, Character> sToT = new HashMap<>();   
        for( int i = 0, j = 0; i < s.length(); i++ , j++){
            if (sToT.containsKey(s.charAt(i)) && sToT.get(s.charAt(i)) != t.charAt(j) ) {
                return false;
            } else if(tToS.containsKey(t.charAt(j)) && tToS.get(t.charAt(j)) != s.charAt(i)) {
                return false;
            }
            else {
                sToT.put(s.charAt(i), t.charAt(j));
                tToS.put(t.charAt(i), s.charAt(j));
            }
        }
        return true;
    }
}