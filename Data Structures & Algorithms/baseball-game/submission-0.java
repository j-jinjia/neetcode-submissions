class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        
        for(String op : operations) {
            if(op.equals("+")) {
                // Pop, calculate sum of previous two, push both back and new sum
                int top = stack.pop();
                int newScore = top + stack.peek();
                stack.push(top);
                stack.push(newScore);
            } else if(op.equals("D")) {
                // Double the top score
                stack.push(2 * stack.peek());
            } else if(op.equals("C")) {
                // Remove the top score
                stack.pop();
            } else {
                // It's a number
                stack.push(Integer.parseInt(op));
            }
        }
        
        // Sum all remaining scores
        int sum = 0;
        for(int score : stack) {
            sum += score;
        }
        return sum;
    }
}