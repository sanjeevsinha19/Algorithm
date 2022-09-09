package com.test.sanjeev.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeLevelOrderTraesal {


	public static void main(String[] args) {

	}

	public List<List<Integer>> levelorderTraversal(BinaryTreeNode root) {

		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.add(root);
		BinaryTreeNode node = root;

		while (!q.isEmpty()) {
			int count = q.size();
			ArrayList<Integer> temp = new ArrayList<Integer>();
			for (int i = 0; i < count; i++) {
				node = q.remove();
				temp.add(node.value);
				if (node.left != null)
					q.add(node.left);
				else
					temp.add(null);
				if (node.right != null)
					q.add(node.right);
				else
					temp.add(null);	
			}
			result.add(temp);
		}
		return result;

	}
}
