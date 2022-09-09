package com.test.sanjeev;


import java.util.ArrayList;

public class PossibleExpressionForTragetValue {

	public static void main(String[] args) {
		ArrayList<String> bag = new ArrayList<>();
		String s ="1234";
		
		System.out.print(generate_all_expressions(s, 11L));
	}

	static ArrayList<String> generate_all_expressions(String s, Long target) {
		// Write your code here.
		ArrayList<String> bag = new ArrayList<>();
		 char[] s1 = s.toCharArray();
		String slate =""+s.charAt(0);
		s.toCharArray();
		helper(s, target, bag, slate, 0);
		return bag;
	}
	
	static void helper(String str, Long k, ArrayList<String> bag, String slate, int n) {
		// TODO Auto-generated method stub
		if (n == str.length() - 1) {
			String temp = slate;

			evaluate(slate, k, bag);
				
			return;
		}

		helper(str, k,bag,   slate + "+" + str.charAt(n + 1), n + 1);
		helper(str, k,bag, slate + "*" + str.charAt(n + 1), n + 1);
		helper(str, k,bag,   slate + "" + str.charAt(n + 1), n + 1);

	}

	 static void  evaluate(String slate, Long k, ArrayList<String> bag) {
		String s = slate;
		s = s.replace("*", "M");
		s = s.replace("+", "P");
		
		Long  result = 0L;

		String[] splitPlus = s.split("P");
		ArrayList<Long> total = new ArrayList<>();
		for (String sp : splitPlus) {
			if (sp.contains("M")) {
				String splitMult[] = sp.split("M");
				Long value = 1L;
				for (String sm : splitMult) {
					value *= Long.parseLong(sm);
				}
				total.add(value);
			} else {
				total.add(Long.parseLong(sp));
			}

		}
		for (Long val : total)
			result += val;
	if((result- k)==0)
		bag.add(slate);

	}

}
