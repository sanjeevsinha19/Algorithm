package com.test.sanjeev;

import java.util.HashSet;

public class FirstLetterToAppearTwice {

	public static void main(String[] args) {
		System.out.print(repeatedCharacter("adgghhk"));
	}

static  char repeatedCharacter(String s) {
	
	HashSet<Character> bag = new HashSet<>();
	
	for(char c: s.toCharArray()) {
		if(bag.contains(c))
			return c;
		else
			bag.add(c);
	}
	
	
	return 0;
	
}
}