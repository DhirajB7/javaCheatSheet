package week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MergeSortedArray {
	
	 public static void merge(int[] nums1, int m, int[] nums2, int n) {

		 ArrayList<Integer> al = new ArrayList<Integer>();
		 ArrayList<Integer> al2 = new ArrayList<Integer>();
		 
		 for(int i = 0 ; i < m ;i++) {
			 al.add(nums1[i]);
		 }
		 
		 for(int i = 0; i < n; i ++) {
			 al2.add(nums2[i]);
		 }
		 
		al.addAll(al2);
		
		Collections.sort(al);
		
		for(int i = 0 ; i < al.size() ;i++) {
			nums1[i] =al.get(i);
		}
		 
		 System.out.println(Arrays.toString(nums1));
		 
		 
	    }
	
	public static void main(String[] args) {
		int[] nums1= {1,2,3,0,0,0};
		int m = 3;
		int[] nums2= {2,5,6};
		int n = 3;
		merge(nums1, m, nums2, n);
	}

}
