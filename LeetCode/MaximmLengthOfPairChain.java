package leetcode;

import java.util.Arrays;

public class MaximmLengthOfPairChain {
	
	
	  public int findLongestChain(int[][] pairs) {
	        
		  
		  int ans = 0;
		  int max = Integer.MIN_VALUE;
		  
		  Arrays.sort(pairs, (a, b) -> a[1] - b[1]);
		  
		  for(int i = 0 ; i < pairs.length ; i++) {
			  int a = pairs[i][0];
			  int b = pairs[i][1];
			  if(max<a) {
				  max = b;
				  ans++;
			  }
			  
		  }
		  
		  return ans;
		  
	    }
	  
	public static void main(String[] args) {
		
		int[][] pairs = {{1,2}, {2,3}, {3,4},{8,9}};
		
		MaximmLengthOfPairChain mc = new MaximmLengthOfPairChain();
		System.out.println(mc.findLongestChain(pairs));
		
		
	}
	

}
