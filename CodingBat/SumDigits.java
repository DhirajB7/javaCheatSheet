package CodingBat;

public class SumDigits {

	public int sumDigits(int n) {
		  int answer = 0;
		  
		   int a = n/10;
		   
		   int b = n%10;
		  
		  if(a==0) {
			  return b;
		  }else {
			  answer = b + sumDigits(a);
		  }
		  
		  return answer;
	}

	
	public static void main(String[] args) {
		
		SumDigits sd = new SumDigits();
		System.out.println(sd.sumDigits(126));
		System.out.println(sd.sumDigits(49));
	}
}
