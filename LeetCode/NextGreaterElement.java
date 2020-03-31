package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class NextGreaterElement {

	  public static int[] nextGreaterElements(int[] nums) {
	        
	         ArrayList<Integer> al  = new ArrayList<>();
	        ArrayList<Integer> answer = new ArrayList<>();

	        for(Integer a : nums){
	            al.add(a);
	        }

	        int j =0;
	        for(int i = 0 ; i < al.size()*2;i++){
	        	if(i==al.size()-1) {
	        		j=0;
	        	}
	            int number = al.get(j)+1;
	            if(al.contains(number)){
	                answer.add(j,number);
	            }else{
	                answer.add(j,-1);
	            }
	        }
	        
	        System.out.println(answer);

	        for(int i = 0 ; i < answer.size();i++){
	            nums[i] = answer.get(i);
	        }

	        return nums;
	        
	  }
	  
	  public static void main(String[] args) {
		  
		  int[] nums = {1,2,1};
		  
		  System.out.println(Arrays.toString(nextGreaterElements(nums)));
		
	}
}
