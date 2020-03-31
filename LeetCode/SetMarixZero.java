package week6;

import java.util.TreeSet;

public class SetMarixZero {

	public void setZeroes(int[][] matrix) {
		
		TreeSet<Integer> row = new TreeSet<Integer>();
		TreeSet<Integer> col = new TreeSet<Integer>();
		
		for(int i = 0 ; i < matrix.length;i++) {
			for(int j = 0 ; j < matrix[0].length; j++) {
				if(matrix[i][j]==0) {
					row.add(i);
					col.add(j);
				}
			}
		}
		
		for(Integer a : row) {
			for(int i = 0 ; i < matrix[0].length;i++) {
				matrix[a][i] = 0;
			}
		}
		
		for(Integer a : col) {
			for(int i = 0 ; i < matrix.length;i++) {
				matrix[i][a] = 0;
			}
		}
		
		/*for(int i = 0 ; i < matrix.length;i++) {
			for(int j = 0 ; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}*/
		
	}
	public static void main(String[] args) {
		SetMarixZero smz = new SetMarixZero();
		int[][] matrix = {
				{1,1,1},
				{1,0,1},
				{1,1,1}
		};
		smz.setZeroes(matrix);
	}
}
