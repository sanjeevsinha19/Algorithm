package com.test.sanjeev;

import java.util.ArrayList;

public class SubSettwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		nums.add(-2);
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(6);
		nums.add(8);
		nums.add(11);
		nums.add(12);
		nums.add(13);
		
		System.out.print(twoSum(nums,6));
	}
	
	 public static ArrayList<ArrayList<Integer>> twoSum(ArrayList<Integer> nums, int target) {
		 ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>(); ;
	        
	        isSumFound(nums, target,0,nums.size()-1,ret);
	        return ret;
	        
	    }
	    private static boolean isSumFound(ArrayList<Integer> arr, int sum, int i, int j,ArrayList<ArrayList<Integer>> ret) {
	    if (i == j)
	        return false;
	    if (arr.get(i) + arr.get(j) == sum){
	    	ArrayList<Integer> temp = new ArrayList<Integer>();
	    	
	        temp.add(arr.get(i));
	        temp.add(arr.get(j));
	        
	         ret.add(temp);
	    }
	      
	    if (arr.get(i) + arr.get(j) < sum)
	        return isSumFound(arr, sum, i + 1, j,ret);
	    return isSumFound(arr, sum, i, j - 1,ret);
	    
	}
}
