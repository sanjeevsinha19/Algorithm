package com.test.sanjeev;

import java.util.ArrayList;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		nums.add(2);
		nums.add(3);
		nums.add(4);
		
		
		for(int n=0;n<10;n++)
		System.out.print(fibonacci(n)+",");
	}
	static int fibonacci(int  n ) {
       if(n<=0) {
    	  
    	   return 0;
       }
       if(n==1)
    	   return 1;
      return fibonacci(n-1)+fibonacci(n-2);
      
		
    }
    


}
