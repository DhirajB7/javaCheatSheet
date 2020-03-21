package graph;

import java.util.ArrayList;

public class Node {
	
	int value;
	boolean isVisited;
	ArrayList<Node> neighbours;
	
	public Node(int value) {
		this.value = value;
		isVisited = false;
		neighbours = new ArrayList<Node>();
	}
	
	public void resetNodeIsVisitedToFalse() {
		isVisited = false;
	}
	
	public void visited() {
		isVisited = true;
	}

}
