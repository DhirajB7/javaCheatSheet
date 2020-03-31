package leetcode;

import java.util.ArrayList;

import leetcode.SymmetricTree.TreeNode;

public class RangeSumOfBst {

	int answer = 0;
	ArrayList<Integer> al = new ArrayList<Integer>();
	public int rangeSumBST(TreeNode root, int L, int R) {
		dfsToAl(root);
		for(Integer a : al) {
			if(a>=L && a<=R) {
				answer+=a;
			}
		}
		
		return answer;
	}
	
	void dfsToAl(TreeNode root) {
		if(root==null) {
			return;
		}else {
			dfsToAl(root.left);
			al.add(root.val);
			dfsToAl(root.right);
		}
		
	}

}
