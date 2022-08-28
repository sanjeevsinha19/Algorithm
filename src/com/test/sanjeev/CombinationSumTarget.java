package com.test.sanjeev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class CombinationSumTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> nums = new ArrayList<Integer>();
		Integer [] arr1 = {94, 94, 94, 94, 94, 94, 94, 94, 94, 94, 94, 94, 94, 94, 94, 94, 94, 94, 94, 94, 94, 94, 94, 94, 94};
		nums =  Arrays.asList(arr1);
		
System.out.println(generate_all_combinations(nums,2256));	
	}
	static ArrayList<ArrayList<Integer>> generate_all_combinations(List<Integer> nums, Integer target) {
		HashSet<ArrayList<Integer>> bag = new HashSet<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> bag2 = new ArrayList<ArrayList<Integer>>();
		helper(nums,target, 0, new ArrayList<Integer>(), bag );
		for(ArrayList<Integer> a: bag)
			bag2.add(a);
        return bag2;
    }
	private static void helper(List<Integer> nums, Integer target, Integer n, ArrayList<Integer> arrayList,
			HashSet<ArrayList<Integer>> bag) {
		
		if(n==nums.size()) {
			
			if(arrayList.size()>0) {
			Integer result=0;
			ArrayList<Integer> arrtemp = new ArrayList<Integer>();
			arrtemp =arrayList;
			
			if(true)
				bag.add(arrtemp);
			return;
			}
			return;
			}
		arrayList.add(nums.get(n));
		helper(nums,target,n+1,arrayList, bag);
		arrayList.remove(nums.get(n));
		helper(nums,target,n+1,arrayList, bag);
	

	}
	private static Integer sumofArray(ArrayList<Integer> arr) {
		int sum = 0;
		for(Integer i:arr)
			sum+=i;
		return sum;
	}
}

