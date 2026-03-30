class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if(s == null || s.isEmpty()){
            return true;
        }

        for (char c: s.toCharArray()){
            if(c == '{' || c == '[' || c == '(' ){
                stack.push(c);
            }
            if(c == ']' ){
                if(!stack.isEmpty() && stack.peek() == '['){
                    stack.pop();
                }else{
                    return false;
                }
            }
            if(c ==')'){
                if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                }else{
                    return false;
                }
            }
            if(c == '}'){
                if(!stack.isEmpty() && stack.peek() == '{'){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}


