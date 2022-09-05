package com.test.sanjeev.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeLevelOrderTraesal {

	// Definition for a binary tree node.
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public static void main(String[] args) {

	}

	public List<List<Integer>> levelorderTraversal(TreeNode root) {

		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		TreeNode node = root;

		while (!q.isEmpty()) {
			int count = q.size();
			ArrayList<Integer> temp = new ArrayList<Integer>();
			for (int i = 0; i < count; i++) {
				node = q.remove();
				temp.add(node.val);
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
