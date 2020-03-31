package CodingBat;

public class BunnyEars2 {

	public int bunnyEars2(int bunnies) {
		
		int answer = 0;
		
		if(bunnies==0) {
			return 0;
		}else {
			if(bunnies%2==0) {
				answer = bunnyEars2(bunnies-1)+3;
			}else {
				answer = bunnyEars2(bunnies-1)+2;
			}
		}
		
		return answer;
		  
	}

	public static void main(String[] args) {
		BunnyEars2 be2 = new BunnyEars2();
		System.out.println(be2.bunnyEars2(3));
	}
	
}
