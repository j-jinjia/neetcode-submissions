class Solution {
    public int calculateTime(String keyboard, String word) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i= 0; i < keyboard.length(); i++){
            map.put(keyboard.charAt(i), i);
        }
        int total = 0;
        int startPosition = 0;
        for(int i = 0; i < word.length(); i++){
            char nextCharacter = word.charAt(i);
            int endPosition = map.get(nextCharacter);
            total += Math.abs(startPosition - endPosition);
            startPosition = endPosition;
        }
        return total;
    }
}
