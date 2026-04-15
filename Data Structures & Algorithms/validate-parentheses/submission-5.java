class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if(s.isEmpty() || s == null) {
            return false;
        }
        for (Character c : s.toCharArray()){
            if(!stack.isEmpty() && c == ')' && stack.peek() == '(') {
                stack.pop();
            } else if(!stack.isEmpty() && c == '}' && stack.peek() == '{') {
                stack.pop();
            } else if (!stack.isEmpty() && c == ']' && stack.peek() == '[') {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}
