package week6;

public class CountPrimes {
	
	  public int countPrimes(int n) {
			
			boolean[] bArr = new boolean[n];
			
			int answer = 0;  
			
			for(int i = 2 ; i < n ; i++) {
				if(bArr[i]) {
					continue;
				}
				answer++;
				for(int j = i ; j<n ; j=j+i) {
					bArr[j] = true;
				}
			}
			
			
			return answer;
		}
	
	public static void main(String[] args) {
		CountPrimes cp = new CountPrimes();
		System.out.println(cp.countPrimes(499979));
	}

}
