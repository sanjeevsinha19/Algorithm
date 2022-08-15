package com.test.sanjeev;

public class ISBST {
	
	

	public static void main(String[] args) {
		int [] arr = {300,
			200, 400,100,250,350,300
			
			};
		//ISBST isbst = new ISBST();
		Node root = constructBst(arr, arr.length);
		System.out.println(is_bst(root));
		}

	static class Node
	{
	    int data;
	    Node left, right;
	};
	 
	 
	// function to get a new node
	static Node getNode(int data)
	{
	    // Allocate memory
	    Node newNode = new Node();
	   
	    // put in the data
	    newNode.data = data;
	    newNode.left = newNode.right = null;
	    return newNode;
	}
	 
	 
	// function to construct a BST from
	// its level order traversal
	static Node LevelOrder(Node root , int data )
	{
	    if(root == null)
	    {
	        root = getNode(data);
	        return root;
	    }
	   
	    if(root == null || root.left==null) {
	    	  System.out.println("left "+ data);
	    root.left = LevelOrder(root.left, data);
	  
	    }
	    else {
	    	 System.out.println("right "+ data);
	    root.right = LevelOrder(root.right, data);
	   
	    }
	    return root;    
	}
	 
	static Node constructBst(int arr[], int n)
	{
	    if(n == 0)return null;
	    Node root = null;
	
	    for(int i = 0; i < n; i++) {
	   
	    root = LevelOrder(root , arr[i]);
	   
	    }
	     
	    return root;
	}
		

	
	

    //For your reference:
    class BinaryTreeNode {
        Integer value;
        BinaryTreeNode left;
        BinaryTreeNode right;

        BinaryTreeNode(Integer value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
   
    static Boolean is_bst(Node root) {
        
        if(root==null) return true;
        if(root.left== null && root.right==null)
            return true;
        if(root.left!=null){
            if(root.data <=root.left.data)
            return false;
            else return true;
            
        }
        
        if(root.right!=null){
            if(root.data >= root.right.data)
            return false;
        }
      
       
            Boolean valid = false;
        
            valid  = is_bst(root.left) &&  is_bst(root.right);
           
           
            
            return valid;
       
    }

}
