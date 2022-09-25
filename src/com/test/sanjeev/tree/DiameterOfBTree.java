package com.test.sanjeev.tree;

public class DiameterOfBTree {

	
	  static Integer binary_tree_diameter(BinaryTreeNode root)
	    {
	        // base case if tree is empty
	        if (root == null)
	            return 0;
	 
	        // get the height of left and right sub-trees
	        Integer lheight = height(root.left);
	        Integer rheight = height(root.right);
	 
	        // get the diameter of left and right sub-trees
	        Integer ldiameter = binary_tree_diameter(root.left);
	        Integer rdiameter = binary_tree_diameter(root.right);
	 
	        /* Return max of following three
	          1) Diameter of left subtree
	          2) Diameter of right subtree
	          3) Height of left subtree + height of right
	          subtree + 1
	         */
	        return Math.max(lheight + rheight ,
	                        Math.max(ldiameter, rdiameter));
	    }
	 
	     // The function Compute the "height" of a tree. Height
	    // is the number of BinaryTreeNodes along the longest path from
	    // the root BinaryTreeNode down to the farthest leaf BinaryTreeNode.
	    static Integer height(BinaryTreeNode BinaryTreeNode)
	    {
	        // base case tree is empty
	        if (BinaryTreeNode == null)
	            return 0;
	 
	        // If tree is not empty then height = 1 + max of
	        //  left height and right heights
	        return (1
	                + Math.max(height(BinaryTreeNode.left),
	                           height(BinaryTreeNode.right)));
	    }

	 
	    // Driver Code
	    public static void main(String args[])
	    {
	        // creating a binary tree and entering the BinaryTreeNodes
	        
	    	BinaryTreeNode tree = new BinaryTreeNode(1);
	        tree.left = new BinaryTreeNode(2);
	        tree.right = new BinaryTreeNode(3);
	        tree.left.left = new BinaryTreeNode(4);
	        tree.left.right = new BinaryTreeNode(5);
	 
	        // Function Call
	        System.out.println(
	            "The diameter of given binary tree is : "
	            + binary_tree_diameter(tree));
	    }
}
