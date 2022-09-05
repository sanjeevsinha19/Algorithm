package com.test.sanjeev.tree;

public class MaxDiameterOfTree {

	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(1);
		TreeNode root1 = new TreeNode(2);
		TreeNode root2 = new TreeNode(3);
		TreeNode root3 = new TreeNode(4);
		TreeNode root4 = new TreeNode(5);
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
	private static int  maxDiameter(TreeNode node) {
		if(node ==null ) return 0;
		
		int	lMax = maxDiameter(node.left);	
		int	rMax = maxDiameter(node.right);
		int lDia = rMax+lMax;
		maxDia = Math.max(maxDia, lDia);
		return Math.max(lMax, rMax)+1;
	}

}
