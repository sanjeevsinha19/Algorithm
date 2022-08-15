package com.test.sanjeev;

import java.util.Queue;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {-1,2,4,7};
		int [] ret = twoSum(nums,6);
		System.out.print(ret[0]+" "+ret[1]);
	}
	
	 public static int[] twoSum(int[] nums, int target) {
	        int[] ret = {0,0} ;
	        isSumFound(nums, target,0,nums.length-1,ret);
	        return ret;
	        
	    }
	    private static boolean isSumFound(int[] arr, int sum, int i, int j,int[] ret) {
	    if (i == j)
	        return false;
	    if (arr[i] + arr[j] == sum){
	        ret[0]=i;
	        ret[1]=j;
	         return true;
	    }
	      
	    if (arr[i] + arr[j] < sum)
	        return isSumFound(arr, sum, i + 1, j,ret);
	    return isSumFound(arr, sum, i, j - 1,ret);
	    
	}
}
