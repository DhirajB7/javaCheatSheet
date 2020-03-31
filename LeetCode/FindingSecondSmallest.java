package sessions;

import java.util.TreeSet;

import week4.SymmetricTree.TreeNode;

public class FindingSecondSmallest {

	TreeSet<Integer> ts = new TreeSet<Integer>();

	public int findSecondMinimumValue(TreeNode root) {

		addToSet(root);
		
		if(ts.size()>=2) {
			ts.pollFirst();
			return ts.pollFirst();
		}else{
			return -1;
		}
		
	}

	private void addToSet(TreeNode root) {

		if (root != null) {
			ts.add(root.val);

			System.out.println(root.val);

			addToSet(root.left);
			addToSet(root.right);
		}

	}

}
