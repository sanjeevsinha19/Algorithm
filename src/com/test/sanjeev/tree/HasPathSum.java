package com.test.sanjeev.tree;

public class HasPathSum {

	public static void main(String[] args) {
		Integer[] tree = { 3,9,20,null,null,15,7 };
		
		
		BinaryTreeNode root = new BinaryTreeNode(-2);
		BinaryTreeNode root1 = new BinaryTreeNode(-3);
		//TreeNode root2 = new TreeNode(3);
		//TreeNode root3 = new TreeNode(15);
		//TreeNode root4 = new TreeNode(7);
		
		//root2.left= root3;
		//root2.right = root4;
		//root.left = root1;
		root.right = root1;
		
		System.out.print(hasPathSum(root,-5));

	}
	
	static Boolean hasPathSum(BinaryTreeNode root, int sum) {
		
	
	if(root==null)return false;
	return helper(root, sum, 0, false);
	}
	
	static Boolean helper(BinaryTreeNode node, int target, int sumSofar, Boolean hasPS) {
		if(node == null) return false;

		if(node.left==null && node.right==null) {
			if(sumSofar+node.value == target ) {
				
				return true;
			}
		}
		if(!hasPS &&node.left!=null)
			hasPS = helper(node.left, target,  sumSofar+node.value, hasPS);
		if(!hasPS &&node.right!=null)
			hasPS = helper(node.right, target,  sumSofar+node.value, hasPS);
		return hasPS;
	}

}
