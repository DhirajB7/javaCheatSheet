package leetcode;

import java.util.ArrayList;

import leetcode.SymmetricTree.TreeNode;

public class BSTIterator {

	ArrayList<Integer> al = new ArrayList<Integer>();
	
	int index = 0;

    public BSTIterator(TreeNode root) {
    	loadValues(root);
    }
    
    public void loadValues(TreeNode root) {
    	if(root!=null) {
    		loadValues(root.left);
    		al.add(root.val);
    		loadValues(root.right);
    	}
    }
    
    
    /** @return the next smallest number */
    public int next() {
		
    	int answer = al.get(index);
    	index++;
    	return answer;
        
    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
		if(index<=al.size()-1) {
			return true;
		}else {
			return false;
		}
        
    }
}
