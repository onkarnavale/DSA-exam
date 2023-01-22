package com.tree.oops;

public class InOrder {

	public Node root;
	
	public InOrder() {
		this.root = null;
	}

	public void printInOrder(Node node) {
		
		if(node == null) {
			return;
		}
		
		printInOrder(node.left);
		System.out.print(node.key + " ");
		printInOrder(node.right);
	}
	
	public void printInOrder() {
		
		printInOrder(root);
	}
}
