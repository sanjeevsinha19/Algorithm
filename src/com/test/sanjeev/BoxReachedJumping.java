package com.test.sanjeev;

import java.util.ArrayList;

public class BoxReachedJumping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {6, 5, 10, 1, 4, 0, 0, 6, 5, 3, 2, 0, 0, 0, 4, 0, 8, 9, 0, 4, 0, 0, 8, 0, 2};
				ArrayList<Integer> mjl= new ArrayList<Integer>();
				
				for(int i =0; i<arr.length;i++)
					mjl.add(arr[i]);
				can_reach_last_house(mjl);
	}
	
	 static Boolean Ican_reach_last_house(ArrayList<Integer> mjl) {
	        // Write your code here.
	        
	        if(mjl.size() ==1) return true;
	        Boolean isPathAvailable = false;
	        Boolean zerofound = false;
	        int index =0;
	        for( int i=0;i<mjl.size()-1;i++){
	         if(mjl.get(i)==0){
	             
	            for(int j =i-1, k=1;j>=0;k++, j--){
	                if(mjl.get(j)>k) {
	                    isPathAvailable= true;
	                    break;
	                }
	               
	            } 
	           zerofound=true; 
	        }
	                
	        }
	       
	    
	     if(!zerofound )
	            return true;
	        return isPathAvailable;
	    }
	 
	 static Boolean can_reach_last_house(ArrayList<Integer> nums) {
	        int length = nums.size();
	        if (length == 1) return true;
	        
	        boolean check[] = new boolean[length];
	        check[0] = true;
	        
	        for (int i = 0; i < length; i++) {
	            if (check[i]) {
	                int max = i + nums.get(i);
	                if (max >= length - 1) return true;
	                
	                for (int j = 0; j <= nums.get(i); j++) {
	                    check[i + j] = true;
	                }
	            }
	        }
	        
	        return false;
	    }
	}


