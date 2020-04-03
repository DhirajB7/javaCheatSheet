package hackerrank;

import java.util.Scanner;

public class TimeConversion {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String ip = scan.next();
		
		scan.close();
		
		String hour = ip.split(":")[0];
		
		String min = ip.split(":")[1];
		
		String sec = ip.split(":")[2].substring(0, 2);
		
		String amPm = ip.split(":")[2].substring(2);
		
		if(amPm.equals("PM")) {
			if(!hour.equals("12")) {
				hour = String.valueOf(Integer.valueOf(hour)+12);
			}
		}else {
			if(hour.equals("12")) {
				hour = "00";
			}
		}
		
		System.out.println(hour+":"+min+":"+sec);
		
	
	}

}
