package com.test.sanjeev.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class PostOrderWithoutRecursion {
	public static void main(String[] args) {
		BinaryTreeNode root = new BinaryTreeNode(-100000000);
		BinaryTreeNode root1 = new BinaryTreeNode(100000000);
		BinaryTreeNode root2 = new BinaryTreeNode(-100000000);
		BinaryTreeNode root3 = new BinaryTreeNode(100000000);
		BinaryTreeNode root4 = new BinaryTreeNode( -100000000);
		BinaryTreeNode root5 = new BinaryTreeNode(100000000);
		BinaryTreeNode root6 = new BinaryTreeNode( -100000000);
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
		PostOrderWithoutRecursion poOrder = new PostOrderWithoutRecursion();
		List<Integer> arr = poOrder.postorder_traversal(root);
		
		System.out.print(poOrder.postorder_traversal(root));
	}
	public ArrayList<Integer> postorder_traversal(BinaryTreeNode root) {

		ArrayList<Integer> result = new ArrayList<Integer>();
		if(root==null) return result;
		Stack<BinaryTreeNode> output = new Stack<BinaryTreeNode>();
		Stack<BinaryTreeNode> q = new Stack<BinaryTreeNode>();
		q.push(root);
		
		BinaryTreeNode node = root;

		while (!q.isEmpty()) {
			int count = q.size();
			for (int i = 0; i < count; i++) {
				node = q.pop();		
				output.push(node);			
				if (node.left != null) 
					q.push(node.left);
				if (node.right != null)
					q.push(node.right);	
			}		
		}
		while(!output.empty()) {
			result.add(output.pop().value);
		}
		return result;

	}
	
}


