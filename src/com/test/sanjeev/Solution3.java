package com.test.sanjeev;

import java.util.ArrayList;

public class Solution3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
	
		System.out.print(get_permutations(arr));
	}
	
	/*
	 * public static List<String> twoSum(int[] nums, int target) { List<String> ret
	 * = new ArrayList<>(); isSumFound(nums, target,0,nums.length-1,ret); return
	 * ret;
	 * 
	 * } private static boolean isSumFound(int[] arr, int sum, int i, int j,
	 * List<String> ret ) { if (i == j) return false; if (arr[i] + arr[j] == sum){
	 * ret.add(i+","+j); }
	 * 
	 * if (arr[i] + arr[j] < sum) return isSumFound(arr, sum, i + 1, j,ret); return
	 * isSumFound(arr, sum, i, j - 1,ret);
	 * 
	 * }
	 */
	
	static ArrayList<ArrayList<Integer>> get_permutations(ArrayList<Integer> arr) {
        // Write your code here.
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        permute(arr,result,0);
        return result;
    }
    static void  permute(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> result, int k){
            for(int i = k; i < arr.size(); i++){
                swap(arr, i, k);
                
                permute(arr,result,  k+1);
                swap(arr, k, i);
            }
            if (k == arr.size() -1){
            	ArrayList<Integer> nset= new ArrayList<Integer>(arr);
            	
                result.add(nset);
            }
            
           
        }
        
    static void swap(ArrayList<Integer> arr, int k, int i){
        int temp= arr.get(k);
        arr.set(k,arr.get(i));
        arr.set(i,temp);
        
    }
}
