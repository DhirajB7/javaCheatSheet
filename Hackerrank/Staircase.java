package hackerrank;

import java.util.Scanner;

public class Staircase {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		String answer = "";
		for(int i = 0 ; i < number;i++) {
			answer+="#";
		}
		
		for(int j = number-1 ; j>=0 ;j--) {
			System.out.println(answer.substring(0,j).replace("#", " ")+answer.substring(j));
		}
		
		sc.close();
		
	}
	
}
