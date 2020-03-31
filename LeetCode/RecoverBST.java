package leetcode;


 class TreeNode {
	public int val;
	public TreeNode left;
	public TreeNode right;

	public TreeNode(int x) {
		val = x;
	}
}

public class RecoverBST {

	TreeNode a = null;
	TreeNode b = null;
	
	TreeNode minusOneNode = new TreeNode(Integer.MIN_VALUE);

	public void recoverTree(TreeNode root) {

		inOrder(root);

		
		int temp = a.val;
		a.val = b.val;
		b.val = temp;
	}

	private void inOrder(TreeNode root) {
        
        if (root == null)
            return;
            
        inOrder(root.left);
        
        
        if (a == null && minusOneNode.val >= root.val) {
            a = minusOneNode;
        }
    
        if (a != null && minusOneNode.val >= root.val) {
            b = root;
        }        
        minusOneNode = root;

       

        inOrder(root.right);
}

}