package week2;

import java.util.Arrays;

public class LargestPerimeterTriangle {
	
	public int largestPerimeter(int[] A) {
		Arrays.sort(A);
		int answer = 0;
		for(int i = A.length-1;i>=2;i--) {
			if(A[i-2]+A[i-1]>A[i]) {
				answer = A[i]+A[i-1]+A[i-2];
				break;
			}
		}
		
		return answer;
        
    }


}
