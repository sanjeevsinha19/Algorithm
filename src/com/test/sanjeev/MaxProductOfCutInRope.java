package com.test.sanjeev;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MaxProductOfCutInRope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print(max_product_from_cut_pieces(3));
	}
	
	 

	  
	  static Long max_product_from_cut_pieces(Integer n) {
		    
	      if(n <= 3) return Integer.toUnsignedLong(n) - 1;
	        int a = n / 3, b = n % 3;
	        if(b == 0) return (long)Math.pow(3, a);
	        if(b == 1) return (long)Math.pow(3, a - 1) * 4;
	        return (long)Math.pow(3, a) * 2;
	    }

	}
