package Hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class AVeryBigSum {
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int inputNUmber = scan.nextInt();
		
		BigInteger answer = new BigInteger("0");
		
		for(int i = 0 ; i < inputNUmber ; i++) {
			String value = scan.next();
			answer = answer.add(new BigInteger(value));
		}
		
		System.out.println(answer);
		scan.close();
	}

}
