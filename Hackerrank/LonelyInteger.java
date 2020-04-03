package hackerrank;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LonelyInteger {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int lc = scan.nextInt();

		Queue<Integer> q = new LinkedList<Integer>();

		for (int i = 0; i < lc; i++) {
			q.add(scan.nextInt());
		}

		scan.close();
		
		if (q.size() == 1) {
			System.out.println(q.poll());
		} else {
			while (!q.isEmpty()) {
				int a = q.poll();
				if(!q.contains(a)) {
					System.out.println(a);
					break;
				}else {
					q.remove(new Integer(a));
				}
			}

		}

	}

}
