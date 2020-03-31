package CodingBat;

public class Triangle {
	
	public int triangle(int rows) {
		  int answer = 0;
		  
		  if(rows==0) {
			  return 0;
		  }
		  else{
			  answer = rows+triangle(rows-1);
		  }
		  
		  
		  return answer;
	}
	
	public static void main(String[] args) {
		Triangle t = new Triangle();
		System.out.println(t.triangle(4));
	}


}
