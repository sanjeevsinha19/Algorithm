package com.test.sanjeev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class SubSetAllSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nums = new ArrayList<Integer>();
		//Integer [] arr1 = {94, 94, 94, 94, 94, 94, 94, 94, 94, 94, 94, 94, 94, 94, 94, 94, 94, 94, 94, 94, 94, 94, 94, 94, 94};
		//nums =  Arrays.asList(arr1);
		nums.add(1);
		nums.add(2);
		nums.add(2);
		
		
		
		System.out.print(twoSum(nums,3));
	}
	
	 public static ArrayList<ArrayList<Integer>> twoSum(ArrayList<Integer> nums, int target) {
		 HashSet<ArrayList<Integer>> ret = new HashSet<ArrayList<Integer>>(); 
		 ArrayList<ArrayList<Integer>> ret2 = new ArrayList<ArrayList<Integer>>(); 
       
	        helper(nums, target,0,ret, new ArrayList<>());
	        for(ArrayList<Integer> a:ret)
				 ret2.add(a);
	        return ret2;
	        
	    }
	    private static void  helper(List<Integer> nums, int sum, int n,HashSet<ArrayList<Integer>> ret, ArrayList<Integer> slate) {
	   
	    	if(n==nums.size())
	    	{ if(slate.size()>0)
	  
	    		if(sumofArray(slate)==sum) {
	    			
	    		ret.add(new ArrayList<Integer>(slate));
	    		
	    		return;
	    	 
	    	}
	    	return;
	    	}
	    	slate.add(nums.get(n));
	    	helper(nums,sum,n+1,ret,slate);
	    	slate.remove(nums.get(n));
	    	helper(nums,sum,n+1,ret,slate);
	    
	}
		private static int sumofArray(ArrayList<Integer> arr) {
			int sum = 0;
			for(Integer i:arr)
				sum+=i;
			return sum;
		}
}
