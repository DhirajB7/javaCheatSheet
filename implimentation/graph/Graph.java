package graph;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Stack;
import java.util.stream.Collectors;

public class Graph {

	LinkedHashMap<Integer, Node> alNode = new LinkedHashMap<Integer, Node>();

	int[][] matrix;

	Stack<Node> stack = new Stack<Node>();

	void addAllVertex(int value) {
		if (alNode.get(value) == null) {
			Node node = new Node(value);
			alNode.put(value, node);
		}
	}

	void addEdge(int source, int destination, boolean bidirectional) {

		alNode.get(source).neighbours.add(alNode.get(destination));
		if (bidirectional) {
			alNode.get(destination).neighbours.add(alNode.get(source));
		}

	}

	void printGraphAsAdjectentList() {
		System.out.println("PRINT GRAPH AS ADJECENT LIST");

		for (Entry<Integer, Node> a : alNode.entrySet()) {
			System.out.println(a.getKey() + " "
					+ a.getValue().neighbours.stream().map(aa -> aa.value).collect(Collectors.toList()));
		}
	}

	void printGraphAsAdjectentMatrix() {
		System.out.println("PRINT GRAPH AS ADJECENT MATRIX");
		int size = alNode.size();
		matrix = new int[size][size];

		LinkedHashMap<Integer, Integer> matrixToIndex = new LinkedHashMap<Integer, Integer>();

		int k = 0;
		for (Integer a : alNode.keySet()) {
			matrixToIndex.put(a,k);
			k++;
		}

		for (Integer aa : alNode.keySet()) {
			for (int j = 0; j < alNode.get(aa).neighbours.size(); j++) {
				int a = matrixToIndex.get(aa);
				int b = matrixToIndex.get(alNode.get(aa).neighbours.get(j).value);
				matrix[a][b] = 1;
			}
		}

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void setAllNodeIsVisitedToFalse() {
		alNode.values().forEach(a -> a.isVisited = false);
	}

	public void dfs() {
		System.out.println("DFS");

		setAllNodeIsVisitedToFalse();

		ArrayList<Node> alNodeList = (ArrayList<Node>) alNode.values().stream().collect(Collectors.toList());

		Stack<Node> sNodes = new Stack<Node>();

		sNodes.add(alNodeList.get(0));

		while (!sNodes.isEmpty()) {
			Node node = sNodes.pop();

			if (!node.isVisited) {
				System.out.print(node.value + " ");
				node.visited();
			}

			for (int i = 0; i < node.neighbours.size(); i++) {
				Node n = node.neighbours.get(i);
				if (n != null && !n.isVisited) {
					sNodes.add(n);
				}
			}
		}

	}

	public void bfs() {
		System.out.println("BFS");

		setAllNodeIsVisitedToFalse();

		ArrayList<Node> alNodeList = (ArrayList<Node>) alNode.values().stream().collect(Collectors.toList());

		Queue<Node> qNodes = new LinkedList<Node>();

		qNodes.add(alNodeList.get(0));

		while (!qNodes.isEmpty()) {
			Node node = qNodes.poll();

			if (!node.isVisited) {
				System.out.print(node.value + " ");
				node.visited();
			}

			for (int i = 0; i < node.neighbours.size(); i++) {
				Node n = node.neighbours.get(i);
				if (n != null && !n.isVisited) {
					qNodes.add(n);
				}
			}
		}

	}

	public void topologicalSort() {

		System.out.println("Topological Sort");

		setAllNodeIsVisitedToFalse();

		ArrayList<Node> alNodeList = (ArrayList<Node>) alNode.values().stream().collect(Collectors.toList());

		ts(alNodeList.get(0));

		stack.forEach(a -> System.out.print(a.value + " "));

	}

	private void ts(Node node) {

		for (int i = 0; i < node.neighbours.size(); i++) {
			Node n = node.neighbours.get(i);
			if (n != null && !n.isVisited) {
				ts(n);
				n.visited();
			}
		}
		stack.push(node);
	}

	public static void main(String[] args) {
		Graph graph = new Graph();

		boolean flag = false; // false means directed graph , true means undirected graph

		graph.addAllVertex(40);
		graph.addAllVertex(10);
		graph.addAllVertex(20);
		graph.addAllVertex(30);
		graph.addAllVertex(50);
		graph.addAllVertex(60);
		graph.addAllVertex(70);

		graph.addEdge(40, 20, flag);
		graph.addEdge(40, 10, flag);
		graph.addEdge(10, 30, flag);
		graph.addEdge(20, 50, flag);
		graph.addEdge(20, 30, flag);
		graph.addEdge(20, 60, flag);
		graph.addEdge(20, 10, flag);
		graph.addEdge(30, 60, flag);
		graph.addEdge(50, 70, flag);
		graph.addEdge(60, 70, flag);

		graph.printGraphAsAdjectentList();
		System.out.println();
		graph.printGraphAsAdjectentMatrix();
		System.out.println();
		graph.dfs();
		System.out.println();
		graph.bfs();

		if (!flag) {
			System.out.println();
			graph.topologicalSort();
		}
	}

}
