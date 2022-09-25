package com.test.sanjeev.tree;

import java.util.ArrayList;

//Java implementation to construct a BST
//from its level order traversal
class PostOrderTraversalTree {

//node of a BST

//function to get a newTreeNode
	static BinaryTreeNode getNode(Integer data) {
		// Allocate memory
		if(data==null) return null;
		BinaryTreeNode newNode = new BinaryTreeNode(data);

		// put in the data
		newNode.left = newNode.right = null;
		return newNode;
	}
	
	static void  preorderTraversal(BinaryTreeNode root)
	{
	    if (root == null)
	        return;
	         
	    System.out.print(root.value + " ");
	     
	    preorderTraversal(root.left);
	    preorderTraversal(root.right);
	}

//function to construct a BST from
//its level order traversal
	static BinaryTreeNode LevelOrder(BinaryTreeNode root, int data) {
		if (root == null) {
			root = getNode(data);
			return root;
		}
		if (data <= root.value)
			root.left = LevelOrder(root.left, data);
		else
			root.right = LevelOrder(root.right, data);
		return root;
	}

	static BinaryTreeNode constructBst(Integer arr[], int n) {
		if (n == 0)
			return null;
		
		BinaryTreeNode root = null;

		for (int i = 0; i < n-1; i++) {
			
			root = LevelOrder(root, arr[i]);
			
		}

		return root;
	}

//function to print the inorder traversal
	
	  static ArrayList<Integer> inorderTraversal(BinaryTreeNode root, ArrayList<Integer> result) { 
		  if (root == null) return result;
	  result.add(root.value);
	  inorderTraversal(root.left, result); 
	  inorderTraversal(root.right, result);
	  return result;
	  }
	 
	//function to print the inorder traversal
		
	  static void postorderTraversal(BinaryTreeNode root) { 
		  if (root == null) return;
	  
		  postorderTraversal(root.left); 
		 
		  postorderTraversal(root.right);
		  System.out.print(root.value + " ");
	  }
//Driver code
	public static void main(String args[]) {
		Integer arr[] = { 3, 9, 20, null, null, 15, 7 };
		int n = arr.length;

		BinaryTreeNode root = constructBst(arr, n);

		//System.out.print("Inorder Traversal: ");
		//inorderTraversal(root);
	}
}