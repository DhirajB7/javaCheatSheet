package leetcode;

import java.util.Arrays;

public class NumbrOnes {

	public static int hammingWeight(int n) {
		
		String nn  = Integer.toBinaryString(n);
		
		return (int) Arrays.stream(nn.split("")).filter(a->a.equals("1")).count();
    }
	
	public static void main(String[] args) {
		hammingWeight(11);
	}

}
