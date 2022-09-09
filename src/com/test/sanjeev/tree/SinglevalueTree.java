package com.test.sanjeev.tree;

public class SinglevalueTree {

	public static void main(String[] args) {
		BinaryTreeNode root = new BinaryTreeNode(2);
		BinaryTreeNode root1 = new BinaryTreeNode(2);
		BinaryTreeNode root2 = new BinaryTreeNode(2);
		BinaryTreeNode root3 = new BinaryTreeNode(3);
		BinaryTreeNode root4 = new BinaryTreeNode(2);
		//TreeNode root5 = new TreeNode(1);
		//root2.left= root3;
		//root2.right = root4;
		root.left = root1;
		root.right = root2;	
		root1.left = root3;
		root1.right= root4;
	
		SinglevalueTree s = new SinglevalueTree();
		System.out.print(s.getUnivaleSubtrees(root));
	}


	int univalCount =0;
boolean getUnivaleSubtrees(BinaryTreeNode root) {
	helper(root);
	return univalCount==1;
	
}
private Boolean helper(BinaryTreeNode node) {
	if(node.left==null && node.right==null) {
		univalCount++;
		return true;
		
	}
	if(node.left == null) return true;
	if(node.right== null ) return true;
	Boolean leftUval = helper(node.left);
	Boolean rightUval = helper(node.right);
	if(leftUval && rightUval) {
		if(node.left.value== node.value && node.right.value== node.value) {
			univalCount--;
			return true;
		}
		else {
			//univalCount++;
			return false;
		}
		
	
	}
	return rightUval&&leftUval;
	
}
 

}

