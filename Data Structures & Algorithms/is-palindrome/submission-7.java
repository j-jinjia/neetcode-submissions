class Solution {
    public boolean isPalindrome(String s) {
        //Brute force 
        StringBuilder newStr = new StringBuilder();
        for(char c : s.toCharArray()) {
            if(Character.isLetterOrDigit(c)){
                newStr.append(Character.toLowerCase(c));
            }
        }

        String cleanStr = newStr.toString();
        String reversedStr = newStr.reverse().toString();
        return cleanStr.equals(reversedStr);
    }
}
