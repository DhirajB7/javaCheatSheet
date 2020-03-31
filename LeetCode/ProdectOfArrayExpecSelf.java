package leetcode;

import java.util.Arrays;

public class ProdectOfArrayExpecSelf {

	public int[] productExceptSelf(int[] nums) {

		int length = nums.length;

		int[] leftToRight = new int[length];
		leftToRight[0] = 1;

		int[] rightToLeft = new int[length];
		rightToLeft[length - 1] = 1;

		for (int i = 0; i < length - 1; i++) {
			leftToRight[i + 1] = nums[i] * leftToRight[i];
		}

		for (int i = length - 1; i > 0; i--) {
			rightToLeft[i - 1] = nums[i] * rightToLeft[i];
		}

		for (int i = 0; i < length; i++) {
			nums[i] = leftToRight[i] * rightToLeft[i];
		}

		return nums;

	}

	public static void main(String[] args) {

		ProdectOfArrayExpecSelf pp = new ProdectOfArrayExpecSelf();
		
		int[] nums = {1,2,3,4};
		
		System.out.println(Arrays.toString(pp.productExceptSelf(nums)));
		
		
	}

}
