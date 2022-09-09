package com.test.sanjeev.tree;

public class BST {
   
    public static BinaryTreeNode bstFromPreorder(Integer[] tree) {
        return preOrder(tree,0, tree.length-1);
    }
   
    	 private static BinaryTreeNode preOrder(Integer[] preorder, int start, int end) {
    	        if(start > end) return null;
    	        
    	        BinaryTreeNode node = new BinaryTreeNode(preorder[start]);
    	        int i;
    	        for(i=start;i<=end;i++) {
    	        if(preorder[i] > node.value)
    	            break;
    	        }
    	 
    	        node.left = preOrder(preorder, start+1, i-1);
    	        node.right = preOrder(preorder, i, end);
    	        return node;
    	        
    	        
    	        
    	 }	   
    	  
    }
  //For your reference:
  

