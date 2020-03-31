package week6;

import java.util.ArrayList;

public class RotateArray {

	  public void rotate(int[] nums, int k) {
		  
		  ArrayList<Integer> al = new ArrayList<Integer>();
		  
		  for(int i = 0 ; i < nums.length;i++) {
			  al.add(nums[i]);
		  }
		  
		  for(int i = 0 ; i< k ; i++) {
			  int number = al.get(al.size()-1);
			  al.remove(al.size()-1);
			  al.add(0,number);
			  
		  }
		  
		 		
		  for(int i = 0 ; i < nums.length;i++) {
			  nums[i] = al.get(i); 
			  }
		 
	    }

	  public static void main(String[] args) {
		
		 int[] nums =  {-1};
		 int k = 2;
		 
		 RotateArray ra = new RotateArray();
		 ra.rotate(nums, k);
		  
	}
}
