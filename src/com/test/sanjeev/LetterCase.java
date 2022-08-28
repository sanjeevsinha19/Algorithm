package com.test.sanjeev;

import java.util.ArrayList;

public class LetterCase {

	public static void main(String[] args) {
		ArrayList<String> result= new ArrayList<String>();
		letterCasePermutation("z12d1E ", "", result, 0);
		System.out.println(result);

	}

	private static void letterCasePermutation(String s, String slate,  ArrayList<String> result, int n) {
		
		if(s.length()==n) {
			result.add(slate);
			return ;
		}
		
			while(!s.substring(n,n+1).matches("^[a-zA-Z]+$")) {
				slate= slate+s.substring(n,n+1);
				n++;
			}
			
			letterCasePermutation(s,slate+s.substring(n,n+1).toLowerCase(), result,n+1 );
			letterCasePermutation(s, slate+s.substring(n,n+1).toUpperCase(), result,n+1);
			
			
			
		
	
	}
	

}
