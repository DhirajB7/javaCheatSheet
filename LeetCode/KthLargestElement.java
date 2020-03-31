package week4;

import java.util.ArrayList;
import java.util.Collections;

public class KthLargestElement {

	
	   
	    	public static int findKthLargest(int[] nums, int k) {
	            ArrayList<Integer> al = new ArrayList<>();
	            for(int a : nums){
	                al.add(a);
	            }
	            Collections.sort(al);
	            return al.get(al.size()-k);
	        } 
	
	    
	    public static void main(String[] args) {
	    	int k =2;
	    	int[] nums = {3,2,3,1,2,4,5,5,6};
			findKthLargest(nums, k);
		}
}
