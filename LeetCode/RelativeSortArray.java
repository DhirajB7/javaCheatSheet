package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class RelativeSortArray {
	
public static int[] relativeSortArray(int[] arr1, int[] arr2) {
	
	ArrayList<Integer> al = new ArrayList<Integer>();
	
	Arrays.sort(arr1);
	
	for(Integer a : arr1) {
		al.add(a);
	}
	
	for(int i = arr2.length-1 ; i >=0 ;i--) {
		int number = arr2[i];
		for(int j  = 0 ; j < arr1.length;j++) {
			if(number==arr1[j]) {
				al.remove(al.lastIndexOf(number));
				al.add(0, number);
			}
		}
	}
	
	
	
	for(int i = 0 ; i < arr1.length;i++) {
		arr1[i] = al.get(i);
	}
	
	return arr1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
		int[] arr2 =  {2,1,4,3,9,6};
		System.out.println(Arrays.toString(relativeSortArray(arr1,arr2)));
	}

}
