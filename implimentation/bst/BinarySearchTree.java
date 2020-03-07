package bst;

public class BinarySearchTree {

	Node root;

	// ============INSERT=======================

	public void insert(int key) {
		root = insertNode(root, key);
	}

	private Node insertNode(Node root, int key) {

		if (root == null) { // root node
			root = new Node(key);
			return root;
		}

		if (key < root.key) {
			root.left = insertNode(root.left, key);
		} else if (key > root.key) {
			root.right = insertNode(root.right, key);
		}

		return root;
	}

	// =============INORDER PRINT==============

	public void printAllValues() {
		printNode(root);
	}

	private void printNode(Node node) {
		if (node != null) {
			printNode(node.left);
			System.out.println(node.key);
			printNode(node.right);
		}

	}

	// =================SEARCH OR CONTAINS====================

	public boolean contains(int value) {
		return searchEachNode(root, value);
	}

	private boolean searchEachNode(Node node, int value) {

		if (node == null) {
			return false;
		}

		if (node.key == value) {
			return true;
		} else {
			if (value < node.key) {
				return searchEachNode(node.left, value);
			} else {
				return searchEachNode(node.right, value);
			}
		}

	}

	// ================DELETE A NODE/VALUE=====================

	public void remove(int key) {
		root = deleteNode(root, key);
	}

	private Node deleteNode(Node root, int key) {

		if (root == null) {
			return root;
		}

		// recursion here
		if (key < root.key) {
			root.left = deleteNode(root.left, key);
		} else if (key > root.key) {
			root.right = deleteNode(root.right, key);
		} else { // reached point

			// one child or no child
			if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			}

			// 2 child nodes - Inoder Sccessor - smallest in right subTree

			root.key = minValue(root.right);

			// Delete inorder successor
			 root.right = deleteNode(root.right, root.key);
		}

		return root;
	}

	private int minValue(Node root) {
		int minv = root.key;
		while (root.left != null) {
			minv = root.left.key;
			root = root.left;
		}
		return minv;
	}

	// ################MAIN####################

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();

		// make tree
		bst.insert(50);
		bst.insert(30);
		bst.insert(20);
		bst.insert(40);
		bst.insert(70);
		bst.insert(60);
		bst.insert(80);
		bst.insert(100);
		
		System.out.println("TREE FORMED");
		
		// print
		bst.printAllValues();

		System.out.println("SEARCHING ");
		
		// search
		System.out.println(bst.contains(20));

		System.out.println("REMOVING LEAF AND PRINTING REMAINING");
		
		// remove leaf and check again
		bst.remove(100);
		bst.printAllValues();
		bst.insert(100); // make tree as same as again
		
		System.out.println("REMOVING MIDDLE NODE AND PRINTING REMANING");
		
		//remove non leaf node like 30 and 70 to see changes
		bst.remove(70);
		bst.printAllValues();

	}

}
