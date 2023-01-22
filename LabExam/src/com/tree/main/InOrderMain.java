package com.tree.main;

import com.tree.oops.InOrder;
import com.tree.oops.Node;

public class InOrderMain {

	public static void main(String[] args) {
		
		InOrder io = new InOrder();
		
		io.root = new Node(60);
		io.root.left = new Node(40);
		io.root.right = new Node(80);
		io.root.left.left = new Node(30);
		io.root.left.right = new Node(50);
		io.root.right.left = new Node(70);
		io.root.right.right = new Node(90); 
		
		System.out.println("Inorder traversal: ");
		io.printInOrder();
	}

}
