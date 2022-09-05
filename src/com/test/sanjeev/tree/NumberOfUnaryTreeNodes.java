package com.test.sanjeev.tree;

public class NumberOfUnaryTreeNodes {

	public static void main(String[] args) {
		Integer[] tree = { 1, 2, 3, 4, 5, null, 6 };
		
		
		TreeNode root = new TreeNode(tree[1]);
		
		  root.left = new TreeNode(tree[2]); 
		  root.left.left = new  TreeNode(tree[3]); 
		  root.left.right = new TreeNode(tree[4]);
		  root.right = new TreeNode(tree[2]);
		  root.right.left = new TreeNode(4);
		  root.right.right = new TreeNode(tree[6]);
		 
		System.out.println(find_single_value_trees(root));

	}

	
	// static Integer count =0;
	static Integer find_single_value_trees(TreeNode root) {
		
		process(root);
		return count;
	}

	static Integer count = 0;

	static Boolean process(TreeNode node) {

		if (node == null) {

			return true;
		}
		Boolean right = process(node.right);
		Boolean left = process(node.left);

		if (left == false || right == false)
			return false;

		// If left subtree is singly and non-empty, but data
		// doesn't match
		if (node.left != null && node.val != node.left.val)
			return false;

		// Same for right subtree
		if (node.right != null && node.val != node.right.val)
			return false;

		// If none of the above conditions is true, then
		// tree rooted under root is single valued, increment
		// count and return true.
		count++;
		return true;

	}

	static Integer isUniValTree(TreeNode root, Integer val) {

		if (root == null) {
			return 1;
		}

		// System.out.println(root.value);
		// Current node value is not equal to the parent node value.
		if (root.val != val) {
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
	    public static TreeNode bstFromPreorder(Integer[] tree) {
	        return helper(tree,Integer.MAX_VALUE);
	    }
	    public static TreeNode helper(Integer[] tree,int bound)
	    {
	        if( i==tree.length || tree[i]!=null || tree[i]>bound)
	            return null;
	        TreeNode root=new TreeNode(tree[i++]);
	        root.left=helper(tree,root.val);
	        root.right=helper(tree,bound);
	        return root;
	            
	    }
}
