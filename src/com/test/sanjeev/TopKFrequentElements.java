package com.test.sanjeev;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class TopKFrequentElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(2);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(3);
		arr.add(1);
		arr.add(3);
		System.out.print(find_top_k_frequent_elements(arr, 2));
		
	}

	 static ArrayList<Integer> find_top_k_frequent_elements(ArrayList<Integer> arr, Integer k) {
	        // Write your code here.
	        Map<Integer,Integer> hMap = new HashMap<Integer, Integer>();
	        ArrayList<Integer> result = new ArrayList<Integer>();
	        for(Integer i: arr){
	           hMap.put(i, hMap.getOrDefault(i,0)+1);
	        }
	       
	        PriorityQueue<Map.Entry<Integer, Integer>>  pq = 
	        new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
	        
	        for(Map.Entry entry : hMap.entrySet()){
	            pq.add(entry);
	        
	        }
	        for(int i=0; i<k;i++)
	            result.add(pq.poll().getKey());
	        return  result;
	    }

}
