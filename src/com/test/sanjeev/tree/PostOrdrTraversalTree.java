package com.test.sanjeev.tree;

//Java implementation to construct a BST
//from its level order traversal
class PostOrderTraversalTree {

//node of a BST

//function to get a newTreeNode
	static TreeNode getNode(Integer data) {
		// Allocate memory
		if(data==null) return null;
		TreeNode newNode = new TreeNode(data);

		// put in the data
		newNode.left = newNode.right = null;
		return newNode;
	}
	
	static void  preorderTraversal(TreeNode root)
	{
	    if (root == null)
	        return;
	         
	    System.out.print(root.val + " ");
	     
	    preorderTraversal(root.left);
	    preorderTraversal(root.right);
	}

//function to construct a BST from
//its level order traversal
	static TreeNode LevelOrder(TreeNode root, int data) {
		if (root == null) {
			root = getNode(data);
			return root;
		}
		if (data <= root.val)
			root.left = LevelOrder(root.left, data);
		else
			root.right = LevelOrder(root.right, data);
		return root;
	}

	static TreeNode constructBst(Integer arr[], int n) {
		if (n == 0)
			return null;
		
		TreeNode root = null;

		for (int i = 0; i < n-1; i++) {
			
			root = LevelOrder(root, arr[i]);
			
		}

		return root;
	}

//function to print the inorder traversal
	
	  static void inorderTraversal(TreeNode root) { if (root == null) return;
	  
	  inorderTraversal(root.left); System.out.print(root.val + " ");
	  inorderTraversal(root.right); }
	 

//Driver code
	public static void main(String args[]) {
		Integer arr[] = { 3, 9, 20, null, null, 15, 7 };
		int n = arr.length;

		TreeNode root = constructBst(arr, n);

		//System.out.print("Inorder Traversal: ");
		//inorderTraversal(root);
	}
}