package com.test.sanjeev;

import java.util.ArrayList;

public class MatrixWithBlock {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
		
		ArrayList<Integer> row1 = new ArrayList<Integer>();
		ArrayList<Integer> row2 = new ArrayList<Integer>();
		
		row1.add(1);
		row1.add(1);
		row1.add(0);
		row1.add(1);
		
		row2.add(0);
		row2.add(1);
		row2.add(1);
		row2.add(1);
		matrix.add(row1);
		matrix.add(row2);
		System.out.print(helper(matrix));
	}
	
	static Integer helper(ArrayList<ArrayList<Integer>> matrix) {
		Integer m= matrix.size();
		Integer n = matrix.get(0).size();
		
		if(m<=1 && n<=1)
			return 0;
		Integer [][] dp = new Integer[m][n];
		// fill initial dp paths for row1, 
		Boolean blocked = false;
		for(int i=0;i<m;i++) {
			if(!blocked && matrix.get(i).get(0)!=0) {
				dp[i][0]=1;
			}
			else {
				blocked = true;
				dp[i][0]=0;
			}
		}
		//and col 1
		blocked = false;
		for(int i=0;i<n;i++) {
			if(!blocked && matrix.get(0).get(i)!=0) {
				dp[0][i]=1;
			}
			else {
				blocked = true;
				dp[0][i]=0;
			}
		}
		
		for(int i=1;i<m;i++)
			for(int j=1;j<n;j++) {
				if(matrix.get(i).get(j)!=0)
					dp[i][j]= dp[i-1][j]+dp[i][j-1];
				else
					dp[i][j]=0;
			}
		return dp[m-1][n-1];
	}

}
