package com.test.sanjeev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class DistinctSubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(get_distinct_subsets("dc"));
	}
	
	
	 static ArrayList<String> get_distinct_subsets(String s) {
	        // Write your code here.
	       ArrayList<String> bag = new ArrayList<>();
	       HashSet<String> hash = new HashSet<>();
	       ArrayList<Character> chArr = new ArrayList<>();
	       for(Character ch: s.toCharArray())
	    	   chArr.add(ch);
	       s="";
	       Collections.sort(chArr);
	    	   
	      for(Character ch:chArr) {
	    	  s+=ch;
	      }
	      
	      helper(s,hash,"",0);
	      for(String str:hash)
	    	   bag.add(str);  
	      Collections.sort(bag);
	        return bag;
	    }
	  static void helper(String s,HashSet<String> bag, String slate, int n){
	      if(n==s.length()){
	          bag.add(slate);
	          return;
	      }
	      helper(s,bag, slate+s.charAt(n), n+1);
	      helper(s,bag, slate, n+1);
	      
	      
	      
	  }

}
