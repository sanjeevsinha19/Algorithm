package com.test.sanjeev.tree;

import java.util.List;

public class UpsideDownTree {
	public static void main(String[] args) {
		BinaryTreeNode root = new BinaryTreeNode(1);
		BinaryTreeNode root1 = new BinaryTreeNode(2);
		BinaryTreeNode root2 = new BinaryTreeNode(3);
		BinaryTreeNode root3 = new BinaryTreeNode(4);
		BinaryTreeNode root4 = new BinaryTreeNode(5);
		BinaryTreeNode root5 = new BinaryTreeNode(6);
		//root2.left= root3;
		//root2.right = root4;
		root.left = root1;
		root.right = root2;	
		root1.left = root3;
		root1.right= root4;
		root3.left = root5;
	
		//UpsideDownTree s = new UpsideDownTree();
		//root = s.flip_upside_down(root);
		PostOrderWithoutRecursion poOrder = new PostOrderWithoutRecursion();
		List<Integer> arr = poOrder.postorder_traversal(root);
		
		System.out.print(poOrder.postorder_traversal(root));
	}

	BinaryTreeNode flip_upside_down(BinaryTreeNode root){
	   

	    // In upside down tree, for current root, these should be
	    // the left and right children.
	    BinaryTreeNode assign_me_as_left_of_root = null;
	    BinaryTreeNode assign_me_as_right_of_root = null;

	    while(root!=null) {
	        // Before updating root->left, store its value for future use.
	        BinaryTreeNode next_root = root.left;

	        // In upside down tree, for next_root, these will be
	        // the left and right children.
	        BinaryTreeNode next_assign_me_as_left_of_root = root.right;
	        BinaryTreeNode next_assign_me_as_right_of_root = root;

	        // Make changes for current root. Update left and right children.
	        root.left = assign_me_as_left_of_root;
	        root.right = assign_me_as_right_of_root;

	        if (next_root!=null) {
	            // We have made changes for current root, now go to the next root.
	            root = next_root;
	            assign_me_as_left_of_root = next_assign_me_as_left_of_root;
	            assign_me_as_right_of_root = next_assign_me_as_right_of_root;
	        } else {
	            return root;
	        }
	    }
	  
	    return root;
	}

}
