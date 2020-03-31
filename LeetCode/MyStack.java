package week2;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {
	
	Queue<Integer> qt ;
    /** Initialize your data structure here. */
    public MyStack() {
        qt = new LinkedList<Integer>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
    	 qt.add(x);
         for(int i=0;i<qt.size()-1;i++)
         {
             qt.add(qt.poll());
         }
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return qt.poll();
        
    }
    
    /** Get the top element. */
    public int top() {
        return qt.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return qt.isEmpty();
    }
}