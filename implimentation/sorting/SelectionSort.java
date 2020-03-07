package sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void selecionSort(int[] ipData) {
		
		for(int i = 0 ; i < ipData.length;i++) {
			int maxValue = 0;
			int maxIndex = 0;
			for(int j = 0; j <ipData.length-i; j++) {
				if(maxValue < ipData[j]) {
					maxValue = ipData[j];
					maxIndex = j;
				}
			}
			int temp = ipData[ipData.length-1-i];
			ipData[ipData.length-1-i] = maxValue;
			ipData[maxIndex] = temp;
		}
		
		System.out.println(Arrays.toString(ipData));
		
	}
	
	
	public static void main(String[] args) {
		int[] ip = {10,33,45,67,88,90,1,2,33,444,5,90};
		selecionSort(ip);
	}

}
