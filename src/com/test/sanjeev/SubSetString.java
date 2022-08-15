package com.test.sanjeev;

import java.util.ArrayList;

public class SubSetString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		nums.add(2);
		nums.add(3);
		nums.add(4);
		
		
		
		System.out.print(generate_all_subsets("abcd"));
	}
	static ArrayList<String> generate_all_subsets(String s) {
        // Write your code here.
        ArrayList<String> bag = new ArrayList<String>();
       
        helper(s,0, bag, new ArrayList<Character>());
        return bag;
    }
    public static void helper(String arr,  int n,  ArrayList<String> bag, ArrayList<Character> slate){
        
        if (n >=arr.length()){
            String subset = "";
            for(Character c:slate)
              subset+=c;  
            System.out.println(subset);
            bag.add(subset);
            return;
        }
            slate.add(arr.charAt(n));
            helper(arr, n+1,bag, slate );
            slate.remove(slate.size()-1);
            helper(arr, n+1,bag,slate );
             
            
    }


}
