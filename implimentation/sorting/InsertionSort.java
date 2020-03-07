package sorting;

import java.util.Arrays;

public class InsertionSort {
	
	public static void insertionSort(int[] ip) {
		
		for(int i = 1 ; i < ip.length;i++) {
			int key = ip[i]; 
            int j = i - 1;
            while(j>=0 && ip[j]>key) {
            	ip[j+1] = ip[j]; //movin right side
            	j--;
            }
            ip[j+1] = key;
		}
		
		System.out.println(Arrays.toString(ip));
	}
	

	public static void main(String[] args) {
		
		int[] ip = {10,33,45,67,88,90,1,2,33,444,5,90};
		insertionSort(ip);

	}

}
