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

	private static int helper(ArrayList<Integer> coins, int total) {
		ArrayList<Integer> dp = new ArrayList<Integer>();
		for(int i=0;i<total;i++)
			dp.add(0);
		for(int coin:coins) {
			dp.set(coin, 1);
		}
		
		
		return minNumOfCoins(coins, dp, total);
		
		
	}

public static int minNumOfCoins(ArrayList<Integer> denoms,ArrayList<Integer> dp, int total) {

    for(int amount=1;amount<total;amount++)
        for(int denomIdx=0; denomIdx < denoms.size();denomIdx++){
            int diff = amount - denoms.get(denomIdx);
            if(diff >=0 && dp.get(diff) != Integer.MAX_VALUE){
                
                dp.set(diff, Math.min(dp.get(amount),dp.get(diff)+1));
                
            }
            
        }
    
    return dp.get(dp.size()-1) != Integer.MAX_VALUE ? dp.get(dp.size()-1) : -1;
}  
}
