package CodingBat;

public class BunnyEras {
	
	public int bunnyEars(int bunnies) {
		  int answer = 0;
		  
		  if(bunnies==0) {
			  return 0;
		  }else if(bunnies==1){
			  return 2;
		  }else{
			  answer = bunnyEars(bunnies-1)+2;
		  }
		  
		  return answer;
	}
	
	public int bunnyEarsWithoutRecursion(int bunnies) {
		  return 2*bunnies;
	}
	
	public static void main(String[] args) {
		BunnyEras be = new BunnyEras();
		int a = 10;
		
		System.out.println(be.bunnyEars(a));
		System.out.println(be.bunnyEarsWithoutRecursion(a));
	}

}
