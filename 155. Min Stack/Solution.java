public class MinStack {
    
    private static class ElementWithCachedMin {
        public Integer element;
        public Integer min;
        
        public ElementWithCachedMin(Integer element, Integer min){
            this.element = element;
            this.min = min;
        }
    }
    
    private Deque<ElementWithCachedMin> myStack;
    
    /** initialize your data structure here. */
    public MinStack() {
        myStack = new LinkedList<ElementWithCachedMin>();
    }
    
    public void push(int x) {
        myStack.addFirst(new ElementWithCachedMin(x, Math.min(x, myStack.isEmpty()?x:getMin())));
    }
    
    public void pop() {
        if (myStack.isEmpty()){
            throw new IllegalStateException("empty stack");
        }
        myStack.removeFirst();
    }
    
    public int top() {
        if (myStack.isEmpty()){
            throw new IllegalStateException("empty stack");
        }
        return myStack.peek().element;
    }
    
    public int getMin() {
        if (myStack.isEmpty()){
            throw new IllegalStateException("empty stack");
        }
        return myStack.peek().min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */