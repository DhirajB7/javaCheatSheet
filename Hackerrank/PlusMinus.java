package Hackerrank;

import java.util.Scanner;

public class PlusMinus {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int totalIp = scan.nextInt();
		
		int posCount = 0;
		
		int negCount = 0;
		
		int zeroCount = 0;
		
		for(int i = 0 ; i < totalIp ; i++) {
			int value = scan.nextInt();
			
			if(value>0) {
				posCount++;
			}else if(value<0) {
				negCount++;
			}else {
				zeroCount++;
			}
		}
		
		System.out.println(String.format("%.6g", (float)posCount/totalIp));
		System.out.println(String.format("%.6g", (float)negCount/totalIp));
		System.out.println(String.format("%.6g", (float)zeroCount/totalIp));
		
		scan.close();
		
	}
	
	
}
