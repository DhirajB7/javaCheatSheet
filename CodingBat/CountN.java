package CodingBat;

public class CountN {

	public int count7(int n) {
		int answer = 0;

		int a = n / 10;

		int b = n % 10;

		if (a == 0) {
			if (b == 7) {
				return 1;
			} else {
				return 0;
			}
		} else {
			if (b == 7) {
				answer = 1 + count7(a);
			} else {
				answer = 0 + count7(a);
			}
		}

		return answer;

	}

	public int count8(int n) {
		int answer = 0;

		int a = n / 10;

		int b = n % 10;

		if (a == 0) {
			if (b == 8) {
				return 1;
			} else {
				return 0;
			}
		} else {
			if (b == 8) {
				if (a % 10 == 8) {
					answer = 2 + count8(a);
				}else {
					answer = 1 + count8(a);
				}
			
			} else {
				answer = 0 + count8(a);
			}
		}

		return answer;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CountN cn = new CountN();

		System.out.println(cn.count8(8818));

	}

}
