package leetcode;

import java.util.Stack;

public class MyQueue {
	
	Stack<Integer> st; //init
	Stack<Integer> st2;//for operation
    /** Initialize your data structure here. */
    public MyQueue() {
        st = new Stack<Integer>();
        st2 = new Stack<Integer>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
    	while(!st2.isEmpty()) {
     	   st.push(st2.pop());
        }
         st.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
    	while(!st.isEmpty()) {
     	   st2.push(st.pop());
        }
        return st2.pop();
    }
    
    /** Get the front element. */
    public int peek() {
       while(!st.isEmpty()) {
    	   st2.push(st.pop());
       }
       return st2.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return st.isEmpty() && st2.isEmpty();
    }

}
