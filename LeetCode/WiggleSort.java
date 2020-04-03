package leetcode;

import java.util.Arrays;

public class WiggleSort {

	public void wiggleSort(int[] nums) {
		
		int[] operation = Arrays.copyOf(nums, nums.length);
		
		Arrays.sort(operation);
		
		int len = operation.length;
		
		int midIndex = (len%2==0)? len/2-1: len/2;
		
		int index = 0;
		
		for(int i = 0 ; i <=midIndex ; i++) {
			
			nums[index] = operation[midIndex-i];
			System.out.println(nums[index]);
			
			if(index<len-1) {
			nums[index+1] = operation[len-1-i];
			System.out.println(nums[index+1]);
			}
			
			index = index + 2;
			
		}

	}
	
	public static void main(String[] args) {
		int[] nums = {1, 3, 2, 2, 3, 1};
		WiggleSort ws = new WiggleSort();
		ws.wiggleSort(nums);
	}

}

