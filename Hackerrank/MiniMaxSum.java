package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MiniMaxSum {

	public static void main(String[] args) {
		
		ArrayList<Long> al = new ArrayList<Long>();
		
		Scanner scan = new Scanner(System.in);
		
		String ip = scan.nextLine();
		
		scan.close();
		
		ip.replaceAll("[ ]+", " ");
		
		for(String a:ip.split(" ")) {
			al.add(Long.valueOf(a));
		}
		
		Collections.sort(al);
		
		long sum = al.stream().mapToLong(a->a).sum();
		
		System.out.println(sum-al.get(al.size()-1)+" "+(sum-al.get(0)) );
		
		
	}
}
