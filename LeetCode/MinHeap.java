package week4;

import java.util.PriorityQueue;

public class MinHeap { 
	  
	PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(); 
	
	public void insert(int value) {
		pQueue.add(value);
	}
	
	public void printAll() {
		pQueue.forEach(a->System.out.println(a));
	}
	
	public int getMin() {
		return pQueue.peek();
	}
	
   
    public static void main(String args[]) 
    { 
        MinHeap minHeap = new MinHeap();
        
        minHeap.insert(5); 
        minHeap.insert(4); 
        minHeap.insert(1); 
        minHeap.insert(2); 
        minHeap.insert(3);
        minHeap.insert(19);
        
        minHeap.printAll();
        
        System.out.println("========");
        System.out.println(minHeap.getMin());
        
        
    } 
} 

