package com.test.sanjeev.tree;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class getSumPathClass {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(-2);
		TreeNode root1 = new TreeNode(-3);
		//TreeNode root2 = new TreeNode(3);
		//TreeNode root3 = new TreeNode(15);
		//TreeNode root4 = new TreeNode(7);
		
		//root2.left= root3;
		//root2.right = root4;
		//root.left = root1;
		root.right = root1;
		
		System.out.print(getSumPath(root,-5));

	}

	private static List<List<Integer>> getSumPath(TreeNode root, int targetSum) {
		
		List<List<Integer>> result = new ArrayList<>();
		if(root==null) return result;
		
		
		return helper(root, result, targetSum, new Stack<Integer>());
	}
	static List<List<Integer>> helper(TreeNode node, List<List<Integer>> result, int target, Stack<Integer> slate) {
		slate.push(node.val);
		if(node.left==null && node.right==null) {
			
			if(target- node.val==0) {
				Iterator<Integer> it = slate.iterator();
				List<Integer> temp =  new ArrayList<>();
				while(it.hasNext()) {
					temp.add(it.next());
				}
				result.add(temp);
				
			}
			
		}
			
			if(node.left!=null )
				helper(node.left, result, target- node.val, slate);
			if(node.right!=null)
				helper(node.right, result, target - node.val, slate);
			slate.pop();
		
		return result;
		
	}
}
