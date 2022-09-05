package com.test.sanjeev.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightViewOfTree {

	// Definition for a binary tree node.
	
	public static void main(String[] args) {
		Integer[] tree = { 3,9,20,null,null,15,7 };
		
		
		TreeNode roots = new TreeNode(1);
		TreeNode root1 = new TreeNode(2);
		TreeNode root2 = new TreeNode(3);
		TreeNode root3 = new TreeNode(4);
		//TreeNode root4 = new TreeNode(7);
		
		root2.left= root3;
		//root2.right = root4;
		roots.left = root1;
		roots.right = root2;
		System.out.print(rightSideView(roots));
	}

	public static List<Integer> rightSideView(TreeNode root) {
		
		List<Integer> result = new ArrayList<Integer>();
		if(root==null) return result;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		TreeNode node = root;

		while (!q.isEmpty()) {
			int count = q.size();
			int temp = 0;
			for (int i = 0; i < count; i++) {
				node = q.remove();
				temp = node.val;
				
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
