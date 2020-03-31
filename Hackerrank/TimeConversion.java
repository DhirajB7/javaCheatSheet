package Hackerrank;

import java.util.Scanner;

public class TimeConversion {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String ip = scan.next();
		
		String hour = ip.split(":")[0];
		
		String min = ip.split(":")[1];
		
		String sec = ip.split(":")[2].substring(0, 2);
		
		String amPm = ip.split(":")[2].substring(2);
		
		System.out.println(hour);
		System.out.println(min);
		System.out.println(sec);
		System.out.println(amPm);
		
		
		
	}

}
