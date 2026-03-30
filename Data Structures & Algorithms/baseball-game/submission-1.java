class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int total = 0;
        for(String op:operations){
            if(op.equals("+")){
                int top = stack.pop();
                int second = stack.peek();
                stack.push(top);
                stack.push(top+second);
            }else if(op.equals("C")){
                stack.pop();
            }else if(op.equals("D")){
                int top = stack.peek();
                stack.push(top*2);
            }else{
                stack.push(Integer.parseInt(op));
            }
            
        }

        for(int elements:stack){
            total += elements;
        }
        return total;
    }
}