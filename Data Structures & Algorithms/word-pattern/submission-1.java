class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        Map<Character, String> cToWord = new HashMap<>();

        if (pattern.length() != words.length) return false;
        
        for(int i = 0; i < pattern.length(); i++) {

            Character c = pattern.charAt(i);
            String word = words[i];

            if (cToWord.containsKey(c)) {
                if (!cToWord.get(c).equals(word)) {
                    return false;
                }
            } else {
                if (cToWord.containsValue(word)) {
                    return false;
                }
            }
            cToWord.put(c, word);
        }
        return true;
    }
}