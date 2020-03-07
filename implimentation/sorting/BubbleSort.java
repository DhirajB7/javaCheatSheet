package sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void bubbleSort(int[] inputData) {
		
		for(int i = 0 ; i < inputData.length ; i++) {
			for(int j = 0 ; j < inputData.length-1-i;j++) {
				int a = inputData[j];
				int b = inputData[j+1];
				if(a>b) {
					inputData[j] = b;
					inputData[j+1] = a;
				}
			}
		}
		
		System.out.println(Arrays.toString(inputData));
		
	}
	
	public static void main(String[] args) {
		int[] ip = {10,33,45,67,88,90,1,2,33,444,5,90};
		bubbleSort(ip);
	}
	
}
