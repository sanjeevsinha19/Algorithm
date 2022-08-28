package com.test.sanjeev;

import java.util.ArrayList;
import java.util.HashSet;

public class PossibleTargetSunofSubSet {

	public static void main(String[] args) {
		/*
		 * 
		 * {
"arr": [-10000000000, -10000000000, -80000000000, -30000000000, -180000000000, 110000000000, 60000000000],
"k": -90000000000
}
		 */
		ArrayList<Long> arr = new ArrayList<Long>();
	
		arr.add(10L);
	
		arr.add(20L);
		
		System.out.println(check_if_sum_possible(arr,0L ));// TODO Auto-generated method stub

	}
	static Boolean check_if_sum_possible(ArrayList<Long> arr, Long k) {
	    HashSet<ArrayList<Long>> ret = new HashSet<ArrayList<Long>>(); 
			 ArrayList<ArrayList<Long>> ret2 = new ArrayList<ArrayList<Long>>(); 
	       
		        helper(arr, k,0,ret, new ArrayList<>());
		    
		        return ret.size()>0;
		        
		    }
		    private static void  helper(ArrayList<Long> nums, Long sum, int n,HashSet<ArrayList<Long>> ret, ArrayList<Long> slate) {
		   
		    	if(n==nums.size())
		    	{ if(slate.size()>0)
		    		System.out.println(slate);
		    		
		    		if(sum.equals(sumofArray(slate))) {
		    			
		    		ret.add(new ArrayList<Long>(slate));
		    		
		    		return;
		    	 
		    	}
		    	return;
		    	}
		    	slate.add(nums.get(n));
		    	helper(nums,sum,n+1,ret,slate);
		    	slate.remove(nums.get(n));
		    	helper(nums,sum,n+1,ret,slate);
		    
		}
			private static Long sumofArray(ArrayList<Long> arr) {
				Long sum = 0L;
				if(arr.size()<=0) return Long.MIN_VALUE;
				for(Long i:arr)
					sum+=i;
				return sum;
			}
}
