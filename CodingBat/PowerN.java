package CodingBat;

public class PowerN {

	public int powerN(int base, int n) {
		  if(n==0) {
			  return 1;
		  }else {
			  return base * powerN(base, n-1);
		  }
	}
	
	public static void main(String[] args) {
		PowerN pn = new PowerN();
		
		System.out.println(pn.powerN(3, 2));
	}

	
}
