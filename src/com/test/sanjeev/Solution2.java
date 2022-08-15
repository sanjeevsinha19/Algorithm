package com.test.sanjeev;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print(generateParenthesis(3));
	}
	
	  public static List<String> generateParenthesis(int n) {
		  HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		  
	        List<String> list = new ArrayList<String>();
	        helper(list,n,n,0,"");
	        return list;
	    }
	    
	  static void helper(List<String> parenList, int leftParenLeft, int rightParenLeft,
			    int currLeftDiff, String currString) {
		  
			    if (leftParenLeft == 0 && rightParenLeft == 0) {
			    	parenList.add(currString);
			    	
			  
			      return;
			    }
			    if (leftParenLeft > 0) {
			      helper(parenList, leftParenLeft - 1, rightParenLeft,
			        currLeftDiff + 1, currString + '(');

			    }
			    if (currLeftDiff > 0) {
			      helper(parenList, leftParenLeft, rightParenLeft - 1, currLeftDiff - 1, currString + ')');
			    }
			    Long [] dp= new Long [n+1];
			  }
	  
	  static Long max_product_from_cut_pieces(Integer n) {
		    
	      if(n <= 3) return Integer.toUnsignedLong(n) - 1;
	        int a = n / 3, b = n % 3;
	        if(b == 0) return (long)Math.pow(3, a);
	        if(b == 1) return (long)Math.pow(3, a - 1) * 4;
	        return (long)Math.pow(3, a) * 2;
	    }

	}
