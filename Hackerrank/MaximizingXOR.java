package hackerrank;

import java.util.Scanner;
import java.util.TreeSet;

public class MaximizingXOR {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int i = scan.nextInt();
		
		int j = scan.nextInt();
		
		scan.close();
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		for(int a = i ;a <=j ; a++) {
			for(int b = i ; b <=j ; b++) {
				ts.add(a^b);
			}
		}
		
		System.out.println(ts.last());
	}
}
