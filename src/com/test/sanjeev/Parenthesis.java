package com.test.sanjeev;

import java.util.ArrayList;

public class Parenthesis {
	
	private static ArrayList<String> result;
	public static void main(String[] args) {
		System.out.println(find_all_well_formed_brackets(3));
	}
	static ArrayList<String> find_all_well_formed_brackets(Integer n) {
		  
		  
        ArrayList<String> list = new ArrayList<String>();
        helper(list,n,n,0,"");
        return list;
    }
    
  static void helper(ArrayList<String> parenList, int leftParenLeft, int rightParenLeft,
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

		  }
	}


