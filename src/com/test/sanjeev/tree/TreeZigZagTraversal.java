package com.test.sanjeev.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class TreeZigZagTraversal {
	// Definition for a binary tree node.
		
		public static void main(String[] args) {
			Integer[] tree = { 3,9,20,null,null,15,7 };
			
			
			TreeNode root = new TreeNode(3);
			TreeNode root1 = new TreeNode(9);
			TreeNode root2 = new TreeNode(20);
			TreeNode root3 = new TreeNode(15);
			TreeNode root4 = new TreeNode(7);
			
			root2.left= root3;
			root2.right = root4;
			root.left = root1;
			root.right = root2;
			
			
			
					//PostOrderTraversalTree.constructBst(tree, tree.length);
			
			System.out.print(root);
			
			System.out.print(ZigZagTraversal(root));
		}

		public static List<List<Integer>> ZigZagTraversal(TreeNode root) {
			

			List<List<Integer>> result = new ArrayList<List<Integer>>();
			Queue<TreeNode> q = new LinkedList<TreeNode>();
			
			if(root == null) return result;
			q.add(root);
			TreeNode node = root;
			int levelCount = 0;
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
				levelCount++;
				if(levelCount%2 ==0) {
					ArrayList<Integer> temp2 = new ArrayList<Integer>();
					temp2 = reverse(temp);
					result.add(temp2);
					
				}else
				
				result.add(temp);
				
			}
			return result;

		}

		private static ArrayList<Integer> reverse(ArrayList<Integer> arr) {
			ArrayList<Integer> temp = new ArrayList<Integer>();
			for(int i= arr.size()-1; i>=0;i--)
				temp.add(arr.get(i));
			
			
			return temp;
			
		}
}
