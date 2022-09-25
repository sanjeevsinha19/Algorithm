package com.test.sanjeev.sort.recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class QSortArrayList {

	public static void main(String[] args) {
		
		int [][] arr = {
		{13, 56},
		{1, 3},
		{4, 5},
		{9990, 10341},
		{8, 10},
		{67, 9990}
		};
		
		
		ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
		
		for(int i=0;i<arr.length;i++) {
			ArrayList<Integer> temp = new ArrayList<Integer>();
			temp.add(arr[i][0]);
			temp.add(arr[i][1]);
			lists.add(temp);
		}
		
		Collections.sort(lists, new Comparator<ArrayList<Integer>>() {
            public int compare(ArrayList<Integer> p1, ArrayList<Integer> p2) {
                return p1.get(0) - p2.get(0);
            }
        });
		
		for(ArrayList<Integer> a:lists) {
			System.out.println(a);
		}
	
	}

	


}
