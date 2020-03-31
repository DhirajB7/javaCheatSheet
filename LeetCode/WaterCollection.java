package leetcode;

public class WaterCollection {

	 public int maxArea(int[] height) {
		 
	     int max=0;
	     
	     int leftIndex = 0;
	     int rightIndex = height.length-1;
	     
	     while(leftIndex < rightIndex) {
	    	 int area = Math.min(height[leftIndex],height[rightIndex])*(rightIndex - leftIndex);
	    	 max = Math.max(max, area);
	    	 if(height[leftIndex]<height[rightIndex]) {
	    		 leftIndex++;
	    	 }else {
	    		 rightIndex--;
	    	 }
	     }
	        
	     return max;   
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
