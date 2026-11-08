class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minimum;

    public MinStack() {
        stack = new Stack<>();
        minimum = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if (minimum.empty()) {
            minimum.push(val);
        }
        else if (val < minimum.peek()) {
            minimum.push(val);
        }
        else {
            minimum.push(minimum.peek());
        }
    }
    
    public void pop() {
        if (!stack.empty()) {
            minimum.pop();
            stack.pop();
        }
    }
    
    public int top() {
        if (stack.empty()) {
            return Integer.MIN_VALUE;
        }
        return stack.peek();
    }
    
    public int getMin() {
        return minimum.peek();
    }
}
