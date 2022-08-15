package com.test.sanjeev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class ThreeSetIntersection {

	public static void main(String[] args) {
		ArrayList<Integer> arr1= new ArrayList<Integer>();
		ArrayList<Integer> arr2=new ArrayList<Integer>();
		ArrayList<Integer> arr3=new ArrayList<Integer>();
		arr1.add(10);
		arr1.add(20);
		arr1.add(30);
		
		
		arr2.add(10);
		arr2.add(20);
		//arr2.add(3);
	//	arr2.add(10);
		
		arr3.add(10);
		arr3.add(20);
		arr3.add(30);
		
		System.out.println(find_intersection(arr1, arr2, arr3));
		

	}
	 static ArrayList<Integer> find_intersection(ArrayList<Integer> arr1, ArrayList<Integer> arr2, ArrayList<Integer> arr3) {
	        // Write your code here.
	       ArrayList<Integer> hlist = new ArrayList<Integer>();
	        HashMap<Integer, Integer> hMap1 = new  HashMap<Integer, Integer>();
	        HashMap<Integer, Integer> hMap2 = new  HashMap<Integer, Integer>();
	        HashMap<Integer, Integer> hMap3 = new  HashMap<Integer, Integer>();
	        HashMap<Integer, Integer> tempMap = new  HashMap<Integer, Integer>();
	        ArrayList<Integer> result = new ArrayList<Integer>();
	        for(Integer i: arr1){
	            hMap1.put(i,hMap1.getOrDefault(i,0)+1);
	           if(hlist.indexOf(i)==-1)
	        	   hlist.add(i);
	        }
	        
	         for(Integer i:   arr2){
		            hMap2.put(i,hMap2.getOrDefault(i,0)+1);
		            if(hlist.indexOf(i)==-1)
			        	   hlist.add(i);
		        }
	      
	       
	        
	         for(Integer i:   arr3){
	            hMap3.put(i,hMap3.getOrDefault(i,0)+1);
	            if(hlist.indexOf(i)==-1)
		        	   hlist.add(i);
	        }
	    
	         
	         for(Integer i: hlist)
	         {
	        	 if(hMap1.getOrDefault(i,-1)!=-1 && hMap2.getOrDefault(i,-1)!=-1 && hMap3.getOrDefault(i,-1)!=-1) {
	        		 int repeat = Math.min(Math.min(hMap1.get(i), hMap2.get(i)), hMap3.get(i));
	        		 for(int j=0;j<repeat;j++) {
	        			 result.add(i);
	        		 }
	        	 }
	         }
	         if(result.size()==0)
	        	 result.add(-1);
	        return  result;
	    }
}
