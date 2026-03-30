class MinStack {

    private Stack<Integer> stack;

    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        Stack<Integer> minimumStack = new Stack<>();
        int minimum = stack.peek();
        while(!stack.isEmpty()){
            minimum = Math.min(minimum, stack.peek());
            minimumStack.push(stack.pop());
        }
        
        while(!minimumStack.isEmpty()){
            stack.push(minimumStack.pop());
        }
        return minimum;
    }
}
