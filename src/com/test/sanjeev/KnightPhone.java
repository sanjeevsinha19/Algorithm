package com.test.sanjeev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class KnightPhone {

		public static void main(String[] args) {
		System.out.println(count_phone_numbers_of_given_length(1,2));
	}

	static Long count_phone_numbers_of_given_length(Integer startdigit, Integer phonenumberlength) {
        // Write your code here.
     	  
	    //	if(phonenumberlength==0) return 0L;
	    	//	if(phonenumberlength==0) return 1L;
	        int [][] movesMap = new int[10][];
	     	       
	            movesMap[1] = new int [] {6,8};
	            movesMap[2] = new int [] {7,9};
	            movesMap[3] = new int [] {4,8};
	            movesMap[4] = new int [] {0,3,9};
	            movesMap[5] = new int [] {};
	            movesMap[6] = new int [] {0,1,7};
	            movesMap[7] = new int [] {2,6};
	            movesMap[8] = new int [] {1,3};
	            movesMap[9] = new int [] {2,4};
	            movesMap[0] = new int [] {4,6};
	           
	           
	            Long dp[][] = new Long[phonenumberlength][10];
	            for(int i=0;i<phonenumberlength;i++)
	            	Arrays.fill(dp[i], 0L);
	          //  Arrays.fill(dp[0], 1L); //place on any number
	            dp[0][startdigit] = 1L; //place on specified number-first jump
	            for(int i = 1; i < phonenumberlength; i++){
	                for(int num = 0; num < 10; num++){
	                    for(int j=0 ;j< movesMap[num].length;j++){
	                    	int to = movesMap[num][j];
	                       
	                    	dp[i][num] += dp[i - 1][to];
	                    }
	                }
	            }

	            Long ans = 0L;
	           
	            for(int num = 0; num < 10; num++){
	                ans += dp[phonenumberlength - 1][num];
	            }
	            return ans;
        
    }
}
