package week4;

public class SymmetricTree {

	public class TreeNode {
		public int val;
		public TreeNode left;
		public TreeNode right;

		public TreeNode(int x) {
			val = x;
		}
	}

	class Solution {
	    public boolean isSameTree(TreeNode one, TreeNode two) {
	        
	       if(one==null && two ==null) {
				return true;
			}else if(one==null || two==null) {
				return false;
			}{
				return (one.val==two.val) && isSameTree(one.left, two.right) && isSameTree(one.right, two.left);
			}
	        
	    }

	}
}