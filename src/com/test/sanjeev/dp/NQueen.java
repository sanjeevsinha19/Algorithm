package com.test.sanjeev.dp;
import java.util.ArrayList;
import java.util.Arrays;
public class NQueen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<String>> ans = new ArrayList<ArrayList<String>>();
		int n=8;
		char dp[][]=new char[n][n];
		for(char ar[]:dp)
		Arrays.fill(ar,'-');
		helpme(dp,ans,n,0);
		for(ArrayList<String> s: ans)
			for(String st:s)
			System.out.println(st);
		System.out.println(ans.size());
	}

	private static void helpme(char[][] dp, ArrayList<ArrayList<String>> ans, int n, int col) {
		if(col==n){
			 ArrayList<String> temp=new ArrayList<>();
			    for(int i=0;i<n;i++){
			        temp.add(new String(dp[i]));
			    }
			    ans.add(temp);
	        return;
	    }
	    for(int i=0;i<n;i++){
	        if(isValid(dp,i,col,n)){
	            dp[i][col]='Q';
	            helpme(dp,ans,n,col+1);
	            dp[i][col]='-';
	        }
	    }
	}

	

	public static boolean isValid(char[][] dp,int row, int col,int n){
	    //check row and column
	    for(int i=0;i<n;i++){
	        if(dp[row][i]=='Q'||dp[i][col]=='Q')
	            return false;
	    }
	    int r=row;
	    int c=col;
	    //check diagonal left up
	    while(r>=0&&c>=0){
	        if(dp[r--][c--]=='Q')
	            return false;
	    }
	    r=row;
	    c=col;
		
		
		 
	    //check diagonal left down
	    while(r<n&&c>=0){
	        if(dp[r++][c--]=='Q')
	            return false;
	    }
		
	
		 
	    return true;
	}
	
}
