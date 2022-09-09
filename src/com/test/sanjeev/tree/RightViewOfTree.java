package com.test.sanjeev.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightViewOfTree {

	// Definition for a binary tree node.
	
	public static void main(String[] args) {
		Integer[] tree = { 3,9,20,null,null,15,7 };
		
		
		BinaryTreeNode roots = new BinaryTreeNode(1);
		BinaryTreeNode root1 = new BinaryTreeNode(2);
		BinaryTreeNode root2 = new BinaryTreeNode(3);
		BinaryTreeNode root3 = new BinaryTreeNode(4);
		//TreeNode root4 = new TreeNode(7);
		
		root2.left= root3;
		//root2.right = root4;
		roots.left = root1;
		roots.right = root2;
		System.out.print(rightSideView(roots));
	}

	public static List<Integer> rightSideView(BinaryTreeNode root) {
		
		List<Integer> result = new ArrayList<Integer>();
		if(root==null) return result;
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.add(root);
		BinaryTreeNode node = root;

		while (!q.isEmpty()) {
			int count = q.size();
			int temp = 0;
			for (int i = 0; i < count; i++) {
				node = q.remove();
				temp = node.value;
				
				if (node.left != null)
					q.add(node.left);
				if (node.right != null)
					q.add(node.right);
			}
			result.add(temp);
		}
		return result;

	}
}
