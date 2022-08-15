package com.test.sanjeev;

import java.util.ArrayList;

public class Parenthesis {
	
	private static ArrayList<String> result;
	public static void main(String[] args) {
		System.out.println(generateParenthesis(3));
	}
	static public ArrayList<String> generateParenthesis(int n) {
	    
	    result = new ArrayList<String>();
	    back("", n, 0, n);
	    return result;
	}

	static public void back(String str, int left, int right, int max) {
	    
	    if(right == max) {
	        result.add(str);
	        return;
	    }
	    
	    if(left > right) {
	        StringBuilder sb = new StringBuilder(str);
	        sb.append("(");
	        back(sb.toString(), left-1, right, max);
	    }
	    
	    if(left <= right) {
	        StringBuilder sb = new StringBuilder(str);
	        sb.append(")");
	        back(sb.toString(), left, right+1, max);
	    }
	}
	}


