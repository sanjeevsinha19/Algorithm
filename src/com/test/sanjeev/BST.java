package com.test.sanjeev;



public class BST {
    static Integer i=0;
    public static BinaryTreeNode bstFromPreorder(Integer[] tree) {
        return helper(tree,Integer.MAX_VALUE);
    }
    public static BinaryTreeNode helper(Integer pre[],int bound)
    {
        if(i==pre.length-1 || pre[i]>bound)
            return null;
        BinaryTreeNode root=new BinaryTreeNode(pre[i++]);
        root.left=helper(pre,root.value);
        root.right=helper(pre,bound);
        return root;
            
    }
  //For your reference:
    static class BinaryTreeNode {
        Integer value;
        BinaryTreeNode left;
        BinaryTreeNode right;

        BinaryTreeNode(Integer value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
}
