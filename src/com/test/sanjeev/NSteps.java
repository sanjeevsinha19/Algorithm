package com.test.sanjeev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NSteps {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(5);
	
		System.out.print( helper(list,10));

	}
	
	static Long helper(ArrayList<Integer> steps, Integer n) {

		Long[] res = new Long[n + 1];
		Arrays.fill(res, 0L);
		int k = 0;
		Collections.sort(steps);

		for (Integer s : steps) {
			if (s <= n)
				res[s] = 1L;
		}

		for (int i = steps.get(0); i <= n; i++) {
			for (Integer s : steps)
				if ((i - s) >= 0)
					res[i] += res[i - s];
		}

		return res[n];

	}

}
