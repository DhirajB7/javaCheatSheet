package sessions;

import java.util.ArrayList;
import java.util.Collections;
import week4.SymmetricTree.TreeNode;

public class KthSmallestElement {

	
	ArrayList<Integer> ts = new ArrayList<Integer>();
	
	
	public int kthSmallest(TreeNode root, int k) {

		
		
		addToSet(root);
		
		Collections.sort(ts);
	
		return ts.get(k-1);
	}


	private void addToSet(TreeNode root) {
		
		if(root!=null) {
			ts.add(root.val);
			
			System.out.println(root.val);
			
			addToSet(root.left);
			addToSet(root.right);	
		}
		
	}

	
}
