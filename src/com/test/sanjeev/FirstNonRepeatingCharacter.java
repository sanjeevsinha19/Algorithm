package com.test.sanjeev;

import java.util.HashMap;
import java.util.Map;
class IndexFreq{
	int index =0;
	int freq = 0;
	public IndexFreq(int index, int freq){
		this.index = index;
		this.freq = freq;
	}
}


public class FirstNonRepeatingCharacter {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(helper("abccbaacz"));
	}

	private static char  helper(String s) {
		if(s == null)
			return '_';
		//char[] charArray = string.toCharArray();
		HashMap<Character,IndexFreq > set =new HashMap<>();
		
		for(int i=0;i<s.length();i++) {
			if(set.get(s.charAt(i))==null) {
				IndexFreq fi = new IndexFreq(i,1);	
				set.put(s.charAt(i), fi);
			}
			else 
			{
				IndexFreq fiOld =	set.get(s.charAt(i));
				if(fiOld.freq >=2) continue;
				int f = fiOld.freq+1;
				int indx = fiOld.index;
				
				IndexFreq fi = new IndexFreq(indx,f);	
				set.put(s.charAt(i), fi);
				
			}
		}
		 Character first = '_';
		 int minIndex=100;
		for(Map.Entry<Character,IndexFreq> e : set.entrySet()) {
			
			IndexFreq fiOld  = e.getValue();
			if(fiOld.freq >= 2) {
				
				if(minIndex > fiOld.index) {
					minIndex = fiOld.index;
				}
			}
				
		}
			
		
		return s.charAt(minIndex);
		
	}
	
	
	
	

}
