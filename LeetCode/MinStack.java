package week2;

import java.util.Stack;

class MinStack {

	
	Stack<Integer> st;
    
    public MinStack() {
     st = new Stack<Integer>();
    }
    
    public void push(int x) {
        st.push(x);
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
		return st.peek();
    }
    
    public int getMin() {
		return st.stream().mapToInt(a->a).min().getAsInt();
        
    }
}