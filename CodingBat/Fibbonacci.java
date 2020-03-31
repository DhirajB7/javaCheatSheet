package CodingBat;

public class Fibbonacci {

	public int fibonacci(int n) {
		int answer = 0;
		if(n==0) {
			return 0;
		}else if(n==1) {
			return 1;
		}else {
			answer = fibonacci(n-2)+fibonacci(n-1);
		}
		return answer;
	}

	
	
	public static void main(String[] args) {
		Fibbonacci fb = new Fibbonacci();
		int n = 3;
		System.out.println(fb.fibonacci(n));
	
	}
	
}
