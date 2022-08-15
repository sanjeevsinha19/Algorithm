package com.test.sanjeev;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(2);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(3);
		arr.add(1);
		arr.add(5);
		System.out.print(find_top_k_elements(arr, 2));
		
	}

	 static ArrayList<Integer> find_top_k_elements(ArrayList<Integer> arr, Integer k) {
	        // Write your code here.
	       
	        ArrayList<Integer> result = new ArrayList<Integer>();
	       
	        
	        PriorityQueue<Integer>  pq = 
	        new PriorityQueue<>((a, b) -> b - a);
	        
	        for(Integer entry : arr){
	            pq.add(entry);
	        
	        }
	        for(int i=0; i<k;i++)
	            result.add(pq.poll());
	        return  result;
	    }

}
