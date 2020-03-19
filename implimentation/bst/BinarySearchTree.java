package bst;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

	Node root;

	Queue<Node> qNode = new LinkedList<Node>();

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

	// ====================print====================
	public void printAllValuesInorder() {
		printNodeInOrder(root);
	}

	public void printAllValuesPreOrder() {
		printNodePreOrder(root);
	}

	public void printAllValuesPostOrder() {
		printNodePostOrder(root);
	}
	
	public void printAllValuesLevelOrder() {
		printNodeBFS(root);
	}

	// =============INORDER PRINT==============DFS===
	private void printNodeInOrder(Node node) {
		if (node != null) {
			printNodeInOrder(node.left);
			System.out.print(node.key+" ");
			printNodeInOrder(node.right);
		}

	}

	// =============PRE ORDER PRINT==============DFS===
	private void printNodePreOrder(Node node) {
		if (node != null) {
			System.out.print(node.key+" ");
			printNodePreOrder(node.left);
			printNodePreOrder(node.right);
		}

	}

	// =============post ORDER PRINT==============DFS===
	private void printNodePostOrder(Node node) {
		if (node != null) {
			printNodePostOrder(node.left);
			printNodePostOrder(node.right);
			System.out.print(node.key+" ");
		}

	}

	// ==============BFS=====================

	private void printNodeBFS(Node node) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		
		if (node != null) {
			qNode.add(node);
		}
		
		while(!qNode.isEmpty()) {
			Node value = qNode.poll();
			al.add(value.key);
			if(value.left!=null) {
				qNode.add(value.left);
			}
			if(value.right!=null) {
				qNode.add(value.right);
			}
			
		}
		
		al.forEach(a->System.out.print(a+" "));
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
		bst.insert(1);
		bst.insert(2);
		bst.insert(5);
		bst.insert(3);
		bst.insert(6);
		bst.insert(4);

		System.out.println("=======IN ORDER=====");
		bst.printAllValuesInorder();
		System.out.println();
		
		System.out.println("=====Pre Order====");
		bst.printAllValuesPreOrder();
		System.out.println();
		
		System.out.println("====Post Order=====");
		bst.printAllValuesPostOrder();
		System.out.println();
		
		System.out.println("====Level Order=====");
		bst.printAllValuesLevelOrder();
		System.out.println();
	}

}
