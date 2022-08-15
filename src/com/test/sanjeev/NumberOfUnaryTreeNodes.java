package com.test.sanjeev;

import com.test.sanjeev.BST.BinaryTreeNode;

public class NumberOfUnaryTreeNodes {

	public static void main(String[] args) {
		Integer[] tree = { 1, 2, 3, 4, 5, null, 6 };
		
		
		BinaryTreeNode root = BST.bstFromPreorder(tree);
		/*
		 * root.left = new BinaryTreeNode(tree[1]); root.left.left = new
		 * BinaryTreeNode(tree[3]); root.left.right = new BinaryTreeNode(tree[4]);
		 * root.right = new BinaryTreeNode(tree[2]); root.right.left = new
		 * BinaryTreeNode(4); root.right.right = new BinaryTreeNode(tree[6]);
		 */
		System.out.println(find_single_value_trees(root));

	}

	
	// static Integer count =0;
	static Integer find_single_value_trees(BinaryTreeNode root) {
		
		process(root);
		return count;
	}

	static Integer count = 0;

	static Boolean process(BinaryTreeNode node) {

		if (node == null) {

			return true;
		}
		Boolean right = process(node.right);
		Boolean left = process(node.left);

		if (left == false || right == false)
			return false;

		// If left subtree is singly and non-empty, but data
		// doesn't match
		if (node.left != null && node.value != node.left.value)
			return false;

		// Same for right subtree
		if (node.right != null && node.value != node.right.value)
			return false;

		// If none of the above conditions is true, then
		// tree rooted under root is single valued, increment
		// count and return true.
		count++;
		return true;

	}

	static Integer isUniValTree(BinaryTreeNode root, Integer val) {

		if (root == null) {
			return 1;
		}

		// System.out.println(root.value);
		// Current node value is not equal to the parent node value.
		if (root.value != val) {
			return 0;
		}
		// Left subtree is not unival tree
		if (0 == isUniValTree(root.left, val)) {
			return 0;
		}
		// Right subtree is not unival tree
		if (0 == isUniValTree(root.right, val)) {
			return 0;
		}
		return 1;
	}
	 static Integer i=0;
	    public static BinaryTreeNode bstFromPreorder(Integer[] tree) {
	        return helper(tree,Integer.MAX_VALUE);
	    }
	    public static BinaryTreeNode helper(Integer[] tree,int bound)
	    {
	        if( i==tree.length || tree[i]!=null || tree[i]>bound)
	            return null;
	        BinaryTreeNode root=new BinaryTreeNode(tree[i++]);
	        root.left=helper(tree,root.value);
	        root.right=helper(tree,bound);
	        return root;
	            
	    }
}
