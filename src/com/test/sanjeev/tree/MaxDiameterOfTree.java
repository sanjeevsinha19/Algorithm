package com.test.sanjeev.tree;

public class MaxDiameterOfTree {

	public static void main(String[] args) {
		
		BinaryTreeNode root = new BinaryTreeNode(1);
		BinaryTreeNode root1 = new BinaryTreeNode(2);
		BinaryTreeNode root2 = new BinaryTreeNode(3);
		BinaryTreeNode root3 = new BinaryTreeNode(4);
		BinaryTreeNode root4 = new BinaryTreeNode(5);
		//TreeNode root5 = new TreeNode(1);
		//root2.left= root3;
		//root2.right = root4;
		root1.left = root3;
		root1.right= root4;
		root.left = root1;
		root.right = root2;
		
		
		
				//PostOrderTraversalTree.constructBst(tree, tree.length);
	
		//System.out.print(root);
		maxDiameter(root);
		System.out.print(maxDia);
	}
	static Integer  maxDia = new Integer(0);
	private static int  maxDiameter(BinaryTreeNode node) {
		if(node ==null ) return 0;
		
		int	lMax = maxDiameter(node.left);	
		int	rMax = maxDiameter(node.right);
		int lDia = rMax+lMax;
		maxDia = Math.max(maxDia, lDia);
		return Math.max(lMax, rMax)+1;
	}

}
