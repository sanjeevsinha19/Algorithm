package com.test.sanjeev.tree;

public class DiameterOfTree {
	
	public static void main(String[] args) {
		Integer[] tree = { 3,9,20,null,null,15,7 };
		/*
		 * "root": [3, 0, null, 4, null, 5, null, 2, null, 6, null, 1]
		 */
		
		BinaryTreeNode root = new BinaryTreeNode(3);
		BinaryTreeNode root1 = new BinaryTreeNode(0);
		BinaryTreeNode root2 = new BinaryTreeNode(4);
		BinaryTreeNode root3 = new BinaryTreeNode(5);
		BinaryTreeNode root4 = new BinaryTreeNode(2);
		BinaryTreeNode root5 = new BinaryTreeNode(6);
	
		BinaryTreeNode root6 = new BinaryTreeNode(1);
		
		root.left = root1;
		root1.left = root2;
		root2.left = root3;
		root3.left = root4;
		root4.left = root5;
		root5.left = root6;
		
		DiameterOfTree t= new DiameterOfTree();
		
		System.out.print(binary_tree_diameter(root));

	}

	
	private static Integer binary_tree_diameter(BinaryTreeNode root) {
		  
			return helper(root)[0]-1;
	
    }
    public static int[] helper(BinaryTreeNode root){
        if(root!=null){
            int left[]=helper(root.left);
            int right[]=helper(root.right);
            
            int path=Math.max(1+left[1]+right[1],Math.max(left[0],right[0]));
            int height=Math.max(left[1],right[1])+1;
            return  new int[]{path,height};
        }
        return new int[]{0,0};
    }
   
}
