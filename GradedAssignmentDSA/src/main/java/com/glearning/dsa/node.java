package com.glearning.dsa;

public class node {
	int val;
	node left, right;

	node(int val) {
		this.val = val;
		left = right = null;
	}
}

class main {
	node node;
	node prev = null;
	node newhead = null;

	void processbst(node root) {
		if (root == null)
			return;
		// loop till left leaf
		processbst(root.left);
		node rightnode = root.right;
		// node leftnode = root.left;
		// update new head to hold new root
		if (newhead == null) {
			newhead = root;
			root.left = null;
			prev = root;
		} else {
			// update the right of predecessor and also the predecessor to accomodate next
			// node
			prev.right = root;
			root.left = null;
			prev = root;
		}
		processbst(rightnode);
	}

	void traverse(node root) {
		// traverse till leaf
		if (root == null)
			return;
		System.out.print(root.val + " ");
		traverse(root.right);
	}

	public static void main(String[] args) {
		// given code to test
		main tree = new main();
		tree.node = new node(50);
		tree.node.left = new node(30);
		tree.node.right = new node(60);
		tree.node.left.left = new node(10);
		tree.node.right.left = new node(55);
		// utility method to transform bst to skewed tree
		tree.processbst(tree.node);
		// utility method to print the transformed data
		tree.traverse(tree.newhead);
	}
}
