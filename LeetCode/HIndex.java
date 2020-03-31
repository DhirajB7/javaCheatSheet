package leetcode;

import java.util.Arrays;

public class HIndex {

	public int hIndex(int[] citations) {

		int answer = 0;
		
		Arrays.sort(citations);
		
		for(int i = citations.length-1;i>=0;i--) {
			if(citations[i]>answer) {
				answer++;
			}else {
				break;
			}
		}
		
		
		return answer;

	}

}
