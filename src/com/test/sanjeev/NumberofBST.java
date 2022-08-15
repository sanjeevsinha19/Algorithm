package com.test.sanjeev;

import java.util.ArrayList;

public class NumberofBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		nums.add(2);
		nums.add(3);
		nums.add(4);
		
		
		
		System.out.print(how_many_bsts(3));
	}

	static Long how_many_bsts(Integer n) {
		return helper(n);
	}

	static Long helper(int k) {
		if (k == 1 || k==0)  {
			return 1L;
		}
		
		long  sum =0L;
		
		for (int i = 1; i <= k; i++) {
			long  temp = helper(i - 1);
			sum = sum + temp * helper(k - i);
			

		}
		return sum;

	}

}
