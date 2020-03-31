package sessions;

import java.util.Arrays;

public class FindTheDifference {
	 public static char findTheDifference(String s, String t) {
		 char answer = 0;
		 s=s+"|";
		 char[] sArr = s.toCharArray();
		 Arrays.sort(sArr);
		 
		 char[] tArr = t.toCharArray();
		 Arrays.sort(tArr);
		 
		 
		 System.out.println(Arrays.toString(sArr));
		 System.out.println(Arrays.toString(tArr));
		 
		 for(int i = 0 ; i < t.length();i++) {
			 if(!(String.valueOf(sArr[i]).equals(String.valueOf(tArr[i])))) {
				 answer = tArr[i];
				 break;
			 }
		 }
		 
		 return answer;
	 }
	 
	 public static void main(String[] args) {
		String s = "abcd";
		String t = "abcde";
		System.out.println(findTheDifference(s, t));
	}
}
