class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        Map<Character, Character> match = new HashMap<>();
        match.put('}', '{');
        match.put(']', '[');
        match.put(')', '(');

        if (s.isEmpty()) return false;

        for (Character parenthesis : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == match.get(parenthesis)) {
                stack.pop();
            } else {
                stack.push(parenthesis);
            }
        }
        return stack.isEmpty();
    }
}
