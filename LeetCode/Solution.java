package leetcode;

public class Solution {
	
public static String addBinary(String a, String b) {
	
	int aLength = a.length();
	int bLength = b.length();
	boolean bFlag = false;
	int numberOfZeros = 0;
	String numberOfZerosString="";
	
	String carry = "0";
	String answer="";
	
	if(aLength>bLength) {
		numberOfZeros = aLength-bLength;
		bFlag = true;
	}else {
		numberOfZeros = bLength-aLength;
	}
	
	while(numberOfZeros>0) {
		numberOfZerosString+="0";
		numberOfZeros--;
	}
	
	if(bFlag) {
		b = numberOfZerosString+b;
	}else {
		a = numberOfZerosString+a;
	}
	
	String[] aArray = a.split("");
	String[] bArray = b.split("");

	for(int i = aArray.length-1 ; i >=0 ;i--) {
		if(carry.equals("0")) {
			if(aArray[i].equals("0") && bArray[i].equals("0")) {
				answer = "0"+answer;
				carry = "0";
			}else if(aArray[i].equals("1") && bArray[i].equals("1")) {
				answer = "0"+answer;
				carry = "1";
			}else {
				answer = "1"+answer;
				carry = "0";
			}
			
		}else {
			if(aArray[i].equals("0") && bArray[i].equals("0")) {
				answer = "1"+answer;
				carry = "0";
			}else if(aArray[i].equals("1") && bArray[i].equals("1")) {
				answer = "1"+answer;
				carry = "1";
			}else {
				answer = "0"+answer;
				carry = "1";
			}
		}
	}
	
	
	if(carry.equals("1")) {
		answer = carry + answer;
	}
	return answer;
			
    }
	
	public static void main(String[] args) {
		/*
		 * String a =
		 * "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
		 * String b =
		 * "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
		 */
		String a = "1010";
		String b = "1011";
		System.out.println(addBinary(a, b));
	}

}
