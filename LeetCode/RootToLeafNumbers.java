package leetcode;

import leetcode.SymmetricTree.TreeNode;

public class RootToLeafNumbers {

	int answer = 0;
	
	public int sumNumbers(TreeNode root) {
		
		adder(root,0);
		
		return answer;

	}

	private void adder(TreeNode root, int addValue) {
		
		if(root==null) {
			return;
		}
		
		addValue = addValue*10+root.val;
		
		if(root.left==null && root.right==null) {
			answer+=addValue;
			return;
		}
		
		adder(root.left, addValue);
		adder(root.right, addValue);
		
	}
	
	

}
