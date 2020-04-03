package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FIRSTLASTPOSITIONOFARRAY {

	public int[] searchRange(int[] nums, int target) {

		int[] answer = new int[2];

		List<Integer> al = new ArrayList<Integer>();
		
		for(int a:nums) {
			al.add(a);
		}

		int a = 0;
		int b = 0;

		
		a = al.indexOf(target);
		b = al.lastIndexOf(target);

		answer[0] = a;
		answer[1] = b;

		return answer;
	}

	public static void main(String[] args) {
		int[] nums = { 5, 7, 7, 8, 8, 10 };
		int target = 8;

		FIRSTLASTPOSITIONOFARRAY f = new FIRSTLASTPOSITIONOFARRAY();

		System.out.println(Arrays.toString(f.searchRange(nums, target)));
	}

}
