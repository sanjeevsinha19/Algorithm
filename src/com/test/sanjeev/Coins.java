package com.test.sanjeev;

import java.util.ArrayList;

public class Coins {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(5);
		System.out.print( helper(list,9));

	}

private static int helper(ArrayList<Integer> coins, Integer amount) {
		Integer  n = coins.size();
		Integer dp[][] = new Integer[n+1][amount+1] ;
		
		for(int i=0; i<=n; i++)
			for(int j=0; j<=amount;j++) {
				if(j==0)
					dp[i][j]=0;
				else if(i==0)
					dp[i][j]=100000;
				
				else if(coins.get(i-1)>j)
					dp[i][j] = dp[i-1][j];
				else 
					dp[i][j] = Math.min(1+dp[i][j-coins.get(i-1)], dp[i-1][j]);
			}
			
		return dp[n][amount] > (100000)? -1:dp[n][amount] ;
	}
}
