package week2;

public class ColorSort {

	public void sortColors(int[] nums) {

		int numberOfZeros = 0;
		int numberOfOnes = 0;
		int numberOfTwos = 0;

		for (int i = 0; i < nums.length; i++) {
			
			if (nums[i] == 0) {
				numberOfZeros++;
			} else if (nums[i] == 1) {
				numberOfOnes++;
			} else {
				numberOfTwos++;
			}
	
			
		}
			

		int j = 0 ;
		
		for (int i = 0; i < numberOfZeros; i++) {
				nums[j] = 0;
				j++;
		}

		for (int i = 0; i < numberOfOnes; i++) {
				nums[j] = 0;
				j++;
		}

		for (int i = 0; i < numberOfTwos; i++) {
				nums[j] = 0;
				j++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
