package hackerrank;

import java.util.Scanner;
import java.util.TreeMap;

public class BirthdayCandles {
	
	public static void main(String[] args) {
		
	TreeMap<Long, Long> tm = new TreeMap<Long, Long>();
	  
	Scanner scan = new Scanner(System.in);
	
	long number = scan.nextLong();
	
	for(long i = 0 ; i < number ;i++) {
		long key = scan.nextLong();
		if(tm.get(key)==null) {
			tm.put(key, 1L);
		}else {
			tm.replace(key, tm.get(key), tm.get(key)+1);
		}
	}
	
	scan.close();
	
	System.out.println(tm.lastEntry().getValue());
	
	}
}
