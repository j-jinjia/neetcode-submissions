class Solution {
    public boolean isAnagram(String s, String t) {
        // Brute force:
        if (s.length() != t.length()) {
            return false;
        }

        char[] sSorted = s.toCharArray();
        char[] tSorted = t.toCharArray();
        Arrays.sort(sSorted);
        Arrays.sort(tSorted);
        
        for (int i = 0; i < sSorted.length; i++) {
            if (sSorted[i] != tSorted[i]) {
                return false;
            }
        }

        return true;
        
    }
}
