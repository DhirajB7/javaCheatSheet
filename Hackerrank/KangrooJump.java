package hackerrank;

import java.util.Scanner;

public class KangrooJump {
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int x1 = scan.nextInt();
		
		int v1 = scan.nextInt();
		
		int x2 = scan.nextInt();
		
		int v2 = scan.nextInt();
		
		scan.close();
		
		String answer = "NO";
		
		if(v1>v2) {
			 while(x1<x2) {
				 
				 x1 = x1 + v1;
				 x2 = x2 + v2;
				 
				 if(x1==x2) {
					 answer = "YES";
					 break;
				 }
				 
				 
			 }
		}
		
		System.out.println(answer);
	}

}
