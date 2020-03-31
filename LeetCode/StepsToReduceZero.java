package week3;

public class StepsToReduceZero {
	
public int numberOfSteps (int num) {
	
	int count = 0;
	
	while(num>1) {
		if(num%2==0) {
			num = num/2;
		}else {
			num = num-1;
		}
		count++;
	}
	
	return count;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
