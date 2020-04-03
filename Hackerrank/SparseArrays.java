package hackerrank;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class SparseArrays {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		 int lengthOfFirstData = scan.nextInt();
		  
		 LinkedHashMap<String, Integer> lsm = new LinkedHashMap<String, Integer>();
		 
		 for(int i = 0 ; i < lengthOfFirstData;i++) {
			String key = scan.next();
			if(lsm.get(key)!=null) {
				int value = lsm.get(key);
				lsm.replace(key, value,value+1);
			}else {
				lsm.put(key, 1);
			}
		 }
		
		int lengthOfOtherData = scan.nextInt();
		
		for(int i = 0 ; i < lengthOfOtherData;i++) {
			String key = scan.next();
			if(lsm.get(key)!=null) {
				System.out.println(lsm.get(key));
			}else {
				System.out.println(0);
			}
		}
		
		
		scan.close();
	}

}
