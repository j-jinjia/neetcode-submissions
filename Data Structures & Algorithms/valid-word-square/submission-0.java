class Solution {
    public boolean validWordSquare(List<String> words) {
        // Check each word (row)
        for (int i = 0; i < words.size(); i++) {
            String currentWord = words.get(i);
            
            // Check each character in the current word
            for (int j = 0; j < currentWord.length(); j++) {
                // We need to check three conditions:
                // 1. Does row j exist? (j < words.size())
                // 2. Does column i exist in row j? (i < words.get(j).length())
                // 3. Do the characters match?
                
                if (j >= words.size() || 
                    i >= words.get(j).length() || 
                    currentWord.charAt(j) != words.get(j).charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }
}