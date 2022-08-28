package com.test.sanjeev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class PermuteArrayNoDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(2);
		System.out.println(get_permutations(arr));
	}
	
	 static ArrayList<ArrayList<Integer>> get_permutations(ArrayList<Integer> arr) {
	       ArrayList<ArrayList<Integer>> bag = new  ArrayList<ArrayList<Integer>>();
	   
	       HashSet<ArrayList<Integer>> hash = new HashSet<>();
	       
	       permute( arr, hash,  0);
	       for(ArrayList<Integer> a: hash ) {
	    	   bag.add(a);
	       }
	       return bag;
	    }

	  static void permute(ArrayList<Integer> arr,   HashSet<ArrayList<Integer>> hash ,  int k){
	        for(int i = k; i < arr.size(); i++){
	        
	            Collections.swap(arr, i, k);
	        	
	        	permute(arr, hash, k+1);
	            
	            Collections.swap(arr, k, i);
	        }
	        if (k == arr.size() -1){
	        	
	        	ArrayList<Integer> arrTemp =new ArrayList<Integer>(arr);
	        	 hash.add(arrTemp);
	        }
	    }

}
