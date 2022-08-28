package com.test.sanjeev;

import java.util.ArrayList;
import java.util.HashMap;

public class WordsPhoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( get_words_from_phone_number("1234567"));
	}
	static ArrayList<String> get_words_from_phone_number(String phone_number) {
        ArrayList<String> bag = new ArrayList<>();
        
        HashMap<Character, String> keyMap = new HashMap<>();
        keyMap.put('0',"");
        keyMap.put('1',"");
        keyMap.put('2',"abc");
        keyMap.put('3',"def");
        keyMap.put('4',"ghi");
        keyMap.put('5',"jkl");
        keyMap.put('6',"mno");
        keyMap.put('7',"pqrs");
        keyMap.put('8',"tuv");
        keyMap.put('9',"wxyz");
        
        phone_number = phone_number.replace("0","").replace("1","");
        if (phone_number.length() == 0) {
            bag.add("-1");
        } else 
        	helper(phone_number,keyMap,  bag,new StringBuffer(), 0);
        return bag;
    }

	static void helper(String phone, HashMap<Character, String> keyMap, ArrayList<String> bag, StringBuffer slate, int n) {
		if(n==phone.length()) {
			String s = slate.toString();
			bag.add(s);
			return;
		}	
		String a = keyMap.get(phone.charAt(n));
	
			for(int j=0; j<a.length();j++) {
				 helper(phone,keyMap, bag, slate.append( a.charAt(j)), n+1);
				 slate.deleteCharAt(n);
			}
			
		
	}
}
