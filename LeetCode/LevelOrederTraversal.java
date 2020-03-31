package week4;

import week4.SymmetricTree.TreeNode;

public class LevelOrederTraversal {
	
	class Solution {
		 public boolean hasPathSum(TreeNode root, int sum) {
		       if(root==null) {
		    	   return false;
		       }
		       
		       if(root.left==null && root.right ==null && sum-root.val==0) {
		    	   return true;
		       }
		       
		       return hasPathSum(root.left,sum-root.val)||hasPathSum(root.right,sum-root.val);
		    }
	}

}
