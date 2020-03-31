package CodingBat;

public class Factorial {
	
	public int factorial(int n) {
		int answer = 0 ;
		
		if(n==1) {
			return 1;
		}else {
			answer = factorial(n-1)*n;
		}
		
		return answer; 
	}
	
	public static void main(String[] args) {
		Factorial fct = new Factorial();
		System.out.println(fct.factorial(4));
	}


}
