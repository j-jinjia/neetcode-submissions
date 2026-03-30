class Solution {
    public boolean isSubsequence(String s, String t) {
        Stack sStack = new Stack<>();
        for (int i = s.length() - 1 ; i >= 0; i--){
            sStack.push(s.charAt(i));
        }
        
        for(char c : t.toCharArray()){
            if (!sStack.isEmpty() && sStack.peek().equals(c)){
                sStack.pop();
            }
        }
        return sStack.isEmpty();
    }
}