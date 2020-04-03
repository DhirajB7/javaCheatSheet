package hackerrank;

import java.util.Scanner;

public class DiagDifference {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[][] mat = new int[n][n];
		
		int ltor = 0;
		int rtol = 0;
		
		for(int i = 0 ; i < n; i++) {
			for(int j = 0 ; j < n ; j++ ) {
				mat[i][j] = scan.nextInt();
				
				if(i==j) {
					ltor += mat[i][j];
				}
				
			}
		}
		
			int i = 0 ;
			for(int j = n-1 ; j >=0 ; j-- ) {
				rtol+=mat[i][j];
				i++;
			}
		
			scan.close();
			
		System.out.println(Math.abs(ltor-rtol));
		
		
	}
}
