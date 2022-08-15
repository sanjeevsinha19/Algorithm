package com.test.sanjeev;

import java.util.ArrayList;

public class SubSetAllSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		nums.add(2);
		nums.add(3);
		nums.add(4);
		
		
		
		System.out.print(twoSum(nums,6));
	}
	
	 public static ArrayList<ArrayList<Integer>> twoSum(ArrayList<Integer> nums, int target) {
		 ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>(); ;
	        
	        helper(nums, target,0,ret, new ArrayList<>());
	        return ret;
	        
	    }
	    private static void  helper(ArrayList<Integer> arr, int sum, int n,ArrayList<ArrayList<Integer>> ret, ArrayList<Integer> slate) {
	   
	    	if(n==arr.size())
	    	{ if(slate.size()>0)
	  
	    		if(sumofArray(slate)==sum) {
	    			
	    		ret.add(new ArrayList<Integer>(slate));
	    		
	    		return;
	    	 
	    	}
	    	return;
	    	}
	    	slate.add(arr.get(n));
	    	helper(arr,sum,n+1,ret,slate);
	    	slate.remove(arr.get(n));
	    	helper(arr,sum,n+1,ret,slate);
	    
	}
		private static int sumofArray(ArrayList<Integer> arr) {
			int sum = 0;
			for(Integer i:arr)
				sum+=i;
			return sum;
		}
}
