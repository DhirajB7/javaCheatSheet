package leetcode;

import java.util.HashMap;
import java.util.PriorityQueue;

public class SortMatrixDiagnolly {
	
	 public int[][] diagonalSort(int[][] mat) {
		 
		 HashMap<Integer, PriorityQueue<Integer>> hm = new HashMap<Integer, PriorityQueue<Integer>>();
		 
		 for(int i = 0 ; i< mat.length ; i++) {
			 for(int j =0 ; j < mat[0].length;j++) {
				 hm.putIfAbsent(i-j, new PriorityQueue<Integer>());
				 hm.get(i-j).add(mat[i][j]);
			 }
		 }
		 
		 System.out.println(hm);
		 
		 
		 for(int i = 0 ; i< mat.length ; i++) {
			 for(int j =0 ; j < mat[0].length;j++) {
				 
				 mat[i][j] = hm.get(i-j).poll();
				 
			 }
			 
		 }
		 
		 
		return mat;
	        
	    }
	
	public static void main(String[] args) {
		
		SortMatrixDiagnolly smd = new SortMatrixDiagnolly();
		
		int[][] mat = {{93,49,54,89,100,90,63,28,46,67},{24,97,48,73,62,32,44,100,24,79},{81,65,45,14,79,86,45,53,68,83},{29,83,12,90,39,37,4,91,62,43},{87,19,42,54,30,31,92,24,44,43},{97,63,90,89,38,73,60,31,20,91},{93,36,83,50,27,89,27,47,80,5},{8,99,39,62,24,25,50,58,67,20},{84,42,21,55,92,48,84,6,79,11}};
		
		smd.diagonalSort(mat);
		
		
		
	}

}
