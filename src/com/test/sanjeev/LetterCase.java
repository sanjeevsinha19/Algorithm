package com.test.sanjeev;

import java.util.ArrayList;

public class LetterCase {

	public static void main(String[] args) {
		ArrayList<String> result= new ArrayList<String>();
		System.out.println(letterCasePermutation("z12d", result, 4));

	}

	private static ArrayList<String> letterCasePermutation(String s, ArrayList<String> result, int size) {
		
		if(s.isEmpty()) return result;
		
		
			
			String temp ="";
		for(int i=0;i<s.length();i++) {
			if(s.substring(0,1).matches("^[a-zA-Z]+$")) {
				
				letterCasePermutation(s.substring(i,i+1).toLowerCase(), result,size);
				letterCasePermutation(s.substring(i,i+1).toUpperCase(), result,size);
			}
			else temp= temp+s;
			
			
			
		}
			
		return null;
	}
	

}
