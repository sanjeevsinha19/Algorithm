package com.test.sanjeev;

import java.util.ArrayList;
import java.util.List;


public class pallindromepartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		nums.add(2);
		nums.add(3);
		nums.add(4);
		
		
		
		System.out.print(generate_palindromic_decompositions("eeeeeeeeeeeeeeeeeeee"));
	}

	static ArrayList<String> generate_palindromic_decompositions(String s) {
		// Write your code here.
		ArrayList<String> bag = new ArrayList<String>();
		ArrayList<String> bag2 = new ArrayList<String>();
		helper(s.toCharArray(), 0, bag, new ArrayList<Character>(), "");
		for(int j=bag.size()-1; j>=0;j--)
			bag2.add(bag.get(j));
		return bag2;
	}

	public static void helper(char[] arr, int n, ArrayList<String> bag, ArrayList<Character> slate,
			String last_string) {

		if (n == arr.length) {
			if (isPalindrome(last_string)) {
				String subset = "";
				for (Character c : slate)
					subset += c;
				bag.add(subset);

			}
			
		}
		//if(slate.size()!=0 && slate.get(0)=='|') return;
		slate.add(arr[n]);
		//join
		helper(arr, n + 1, bag, slate, last_string + arr[n]);
		slate.remove(slate.size() - 1);
		// backtracking
		if (!isPalindrome(last_string)) {
			return;
		}
		//partition
		
		if(slate.size()==0) return;
		slate.add('|');
		slate.add(arr[n]);
		last_string = "" + arr[n];
		helper(arr, n + 1, bag, slate, last_string);
		slate.remove(slate.size() - 1);
		slate.remove(slate.size() - 1);

	}
	static Boolean isPalindrome(String s) {
		int left = 0, right = s.length() - 1;
		while (left < right) {
			if (s.charAt(left++) != s.charAt(right--))
				return false;
		}
		return true;
	}
}
