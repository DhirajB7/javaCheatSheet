package hackerrank;

import java.util.Scanner;

public class AppleAndOrange {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int s = scan.nextInt();
		
		int t = scan.nextInt();
		
		int a = scan.nextInt();
		
		int b = scan.nextInt();
		
		int m = scan.nextInt();
		
		int n = scan.nextInt();
		
		int appleCount = 0;
		
		int orangeCount = 0;
		
		for(int i = 0 ; i < m;i++) {
			int location = a + scan.nextInt();
			if(location>=s && location<=t) {
				appleCount++;
			}
		}
		
		for(int i = 0 ; i < n ;i++) {
			int location = b + scan.nextInt();
			if(location>=s && location<=t) {
				orangeCount++;
			}
		}
		
		scan.close();
		
		System.out.println(appleCount);
		System.out.println(orangeCount);
	}

}
