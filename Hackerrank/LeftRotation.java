package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class LeftRotation {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numberOfInput = scan.nextInt();
		int numberOfLeftOperation = scan.nextInt();
		
		if(numberOfLeftOperation>numberOfInput) {
			numberOfLeftOperation = numberOfLeftOperation% numberOfInput;
		}
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i = 0 ; i < numberOfInput ; i++) {
			al.add(scan.nextInt());
		}
		
		for(int i = 0 ; i < numberOfLeftOperation ;i++) {
			int value = al.get(0);
			al.remove(0);
			al.add(value);
		}
		
		al.forEach(a->System.out.print(a+" "));
		
		scan.close();
		
	}

}
