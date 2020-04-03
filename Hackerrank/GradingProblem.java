package hackerrank;

import java.util.Scanner;

public class GradingProblem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int lc = sc.nextInt();
		
		for(int i = 0 ; i < lc ; i++) {
			int marks = sc.nextInt();
			
			if(marks<38) {
				
				System.out.println(marks);
				
			}else {
			
				int modValue = marks%10;
				
				if(modValue==3 || modValue==8) {
					System.out.println(marks+2);
				}else if(modValue==4 || modValue==9) {
					System.out.println(marks+1);
				}else {
					System.out.println(marks);
				}
				
			}
		}
		
		sc.close();

	}

}
