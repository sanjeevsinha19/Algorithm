package com.test.sanjeev;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;

import org.json.*;


class Solution {

static ArrayList<String> generate_all_expressions(String s, Long target) {
	// Write your code here.

	ArrayList<String> bag = new ArrayList<>();

	String slate =""+s.charAt(0);
	helper(s, target, bag, slate, 0);
	return bag;
}

static void helper(String str, Long k, ArrayList<String> bag, String slate, int n) {
	// TODO Auto-generated method stub
	if (n == str.length() - 1) {
		String temp = slate;

		if (evaluate(slate) == k)
			bag.add(slate);
		return;
	}

	helper(str, k, bag, slate + "" + str.charAt(n + 1), n + 1);

	helper(str, k, bag, slate + "+" + str.charAt(n + 1), n + 1);

	helper(str, k, bag, slate + "*" + str.charAt(n + 1), n + 1);

}

private static Long evaluate(String slate) {
	Long result = 0L;

	String[] splitPlus = slate.split("\\+");
	ArrayList<Long> total = new ArrayList<>();
	for (String sp : splitPlus) {
		if (sp.contains("*")) {
			String splitMult[] = sp.split("\\*");
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
	return result;

}
}