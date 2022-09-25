package com.test.sanjeev.sort.recursion;

import java.util.ArrayList;

/**
 * Definition for singly-linked list.
 * public class LinkedListNode {
 *     int val;
 *     LinkedListNode next;
 *     LinkedListNode(int x) { val = x; }
 * }
 */
class MergeKSort {
	
		static class LinkedListNode{
	    	int value;
	    	LinkedListNode next;
	    	LinkedListNode(int i){
	    		this.value  = i;
	    		this.next  = null;
	    	}
		 public static void main(String[] s)
		    {
		        int k = 3;    // total number of linked lists
		       
		        // an array to store the head nodes of the linked lists
		        LinkedListNode[] lists = new LinkedListNode[k];
		 
		        lists[0] = new LinkedListNode(1);
		        lists[0].next = new LinkedListNode(5);
		        lists[0].next.next = new LinkedListNode(7);
		 
		        lists[1] = new LinkedListNode(2);
		        lists[1].next = new LinkedListNode(3);
		        lists[1].next.next = new LinkedListNode(6);
		        lists[1].next.next.next = new LinkedListNode(9);
		 
		        lists[2] = new LinkedListNode(4);
		        lists[2].next = new LinkedListNode(8);
		        lists[2].next.next = new LinkedListNode(10);
		        ArrayList<LinkedListNode> arraylists  = new ArrayList<LinkedListNode>(); 
		        arraylists.add(lists[0]);
		        arraylists.add(lists[1]);
		        arraylists.add(lists[2]);
		 
		        // Merge all lists into one
		        LinkedListNode head = merge_k_lists(arraylists);
		        LinkedListNode node = head;
		        while (node != null)
		        {
		            System.out.print(node.value + " —> ");
		            node = node.next;
		        }
		        System.out.print("null");
		 
		
		    }
		
		
		
		
		
	 static LinkedListNode merge_k_lists(ArrayList<LinkedListNode> lists) {
	        // Write your code here.
	       return helper(lists, 0, lists.size() - 1);
	    }
	    
	 
	    
	    private static LinkedListNode helper(ArrayList<LinkedListNode> lists , int start, int end) {
	        if (start > end)
	            return null;
	        
	        if (start == end)
	            return lists.get(start);
	        
	        int mid = (start + end)/2;
	        
	        LinkedListNode left = helper(lists, start, mid);
	        LinkedListNode right = helper(lists, mid + 1, end);
	        
	        return merge(left, right);
	    }
	    
	    private static LinkedListNode merge(LinkedListNode l1, LinkedListNode l2) {
	        LinkedListNode res = new LinkedListNode(0);
	        LinkedListNode prev = res;
	        
	        while (l1 != null && l2 != null) {
	            if (l1.value < l2.value) {
	                prev.next = l1;
	                l1 = l1.next;
	            } else {
	                prev.next = l2;
	                l2 = l2.next;
	            }
	            prev = prev.next;
	        }
	        
	        prev.next = l1 != null ? l1 : l2;
	        return res.next;
	    }
	}
}