package com.test.sanjeev.tree;

public class SinglevalueTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(2);
		TreeNode root1 = new TreeNode(2);
		TreeNode root2 = new TreeNode(2);
		TreeNode root3 = new TreeNode(3);
		TreeNode root4 = new TreeNode(4);
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
int getUnivaleSubtrees(TreeNode root) {
	helper(root);
	return univalCount;
	
}
private Boolean helper(TreeNode node) {
	if(node.left==null && node.right==null) {
		univalCount++;
		return true;
		
	}
	if(node.left == null) return true;
	if(node.right== null ) return true;
	Boolean leftUval = helper(node.left);
	Boolean rightUval = helper(node.right);
	if(leftUval && rightUval) {
		if(node.left.val== node.val && node.right.val== node.val) {
			univalCount--;
			return true;
		}
		else {
			univalCount++;
			return false;
		}
		
	
	}
	return rightUval&&leftUval;
	
}
 

}

