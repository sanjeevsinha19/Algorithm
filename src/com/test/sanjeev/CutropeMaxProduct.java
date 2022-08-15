package com.test.sanjeev;

import java.io.*;

class CutropeMaxProduct {
 
    // The main function that returns
    // maximum product obtainable from
    // a rope of length n
    static int maxProd(int n)
    {
    	int []dp = new int [n];
        // Base cases
        if (n == 0 || n == 1) return 0;
        //initalize dp for 
        dp[0]= 0;
        dp[1]= 0;
        dp[2] = 2;
        
        
        // Make a cut at different places
        // and take the maximum of all start from 3
        int max_val = 0;
        for (int i = 3; i < n; i++)
        max_val = Math.max(max_val,
                  Math.max(i * (n - i),
                   dp[i]));
 
        // Return the maximum of all values
        return max_val;
    }  
 
    /* Driver program to test above functions */
    public static void main(String[] args)
    {
        System.out.println("Maximum Product is "
                            + maxProd(5));
    }
}
// This code is contributed by Prerna Saini
