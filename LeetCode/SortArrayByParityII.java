package leetcode;

public class SortArrayByParityII {

	public static  int[] sortArrayByParityII(int[] A) {
		int[] al = new int [A.length];
		int j = 0;
		int jj = 0;
		for(int i = 0 ;i < A.length;i++) {
			if(A[i]%2==0) {
				al[2*j] = A[i];
				j++;
			}else {
				al[(2*jj)+1] = A[i];
				jj++;
			}
		}
		
		return al;
	
	
        
    }

	public static void main(String[] args) {
		sortArrayByParityII(new int[] {4,2,5,7});
	}

}
