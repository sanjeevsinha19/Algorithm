package com.test.sanjeev.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Roundtrip {
	public static void main(String[] args) {
	BinaryTreeNode root = new BinaryTreeNode(1);
	BinaryTreeNode root1 = new BinaryTreeNode(2);
	BinaryTreeNode root2 = new BinaryTreeNode(3);
	BinaryTreeNode root3 = new BinaryTreeNode(4);
	BinaryTreeNode root4 = new BinaryTreeNode(5);
	BinaryTreeNode root5 = new BinaryTreeNode(6);
	BinaryTreeNode root6 = new BinaryTreeNode(7);
	//TreeNode root5 = new TreeNode(6);
	//root2.left= root3;
	//root2.right = root4;
	root.left = root1;
	root.right = root2;	
	root1.left = root3;
	root1.right= root4;
	root2.left = root5;
	root2.right = root6;

	//UpsideDownTree s = new UpsideDownTree();
	//root = s.flip_upside_down(root);
	Roundtrip poOrder = new Roundtrip();
	//List<Integer> arr = poOrder.postorder_traversal(root);
	
	
	System.out.print(poOrder.roundtrip(root));
}

	private ArrayList<Integer>  roundtrip(BinaryTreeNode root) {
		ArrayList<Integer> arr = new ArrayList<>();
		if(root==null) return null;
		BinaryTreeNode node = root;
		Stack<Integer> stack = new Stack<Integer>();
		
		while(node!=null) {		
			stack.push(node.value);
			node = node.left;			
		}
		
		while(!stack.isEmpty()) {
			arr.add(stack.pop());
		}
		node = root.right;
		while(node!=null) {		
			arr.add(node.value)	;
			node = node.right;
		}
		
		
		return arr;
	}
}
