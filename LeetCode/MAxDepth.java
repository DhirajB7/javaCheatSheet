package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import leetcode.SymmetricTree.TreeNode;

public class MAxDepth {
	
	class Solution {
		
		List<Integer> al1 = new ArrayList<Integer>();
		List<Integer> al2 = new ArrayList<Integer>();
		
		  public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
			  
			  List<Integer> answer = new ArrayList<Integer>();
			  answer.addAll(getAllElementsOne(root1));
			  answer.addAll(getAllElementsTwo(root2));
			  Collections.sort(answer);
			return answer;
		        
		    }
		  
		  public List<Integer> getAllElementsOne(TreeNode root1){
			  
			  if(root1!=null) {
				  getAllElementsOne(root1.left);
				  al1.add(root1.val);
				  getAllElementsOne(root1.right);
			  }
			  return al1;
		  }
		  
		  public List<Integer> getAllElementsTwo(TreeNode root2){
			  
			  if(root2!=null) {
				  getAllElementsTwo(root2.left);
				  al2.add(root2.val);
				  getAllElementsTwo(root2.right);
			  }
			  return al2;
		  }
	    
	}

}
