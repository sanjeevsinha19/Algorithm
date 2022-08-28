package com.test.sanjeev.dp;


public class Lavenshtein {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(levenshtein_distance("horse", "ros"));
	
	}
	/*
    Asymptotic complexity in terms of length of the input word strings:
    * Time: O(length(word1) * length(word2)).
    * Total space: O(length(word2)).
    */

    static Integer levenshtein_distance(String word1, String word2) {
        char a[] = word1.toCharArray();
        char b[] = word2.toCharArray();
        int n = a.length;
        int m = b.length;

        // Consider first 0 characters from a
        // and first i characters from b.
        int dp[][] = new int[n+1][m + 1];
        for (int i = 0; i <= m; i++) {
            dp[0][i] = i;
        }
        for (int i = 1; i <= n; i++) 
        	 dp[i][0] = i;
        
        for (int i = 1; i <= n; i++) 
        {
          
       for (int j = 1; j <= m; j++) {
                if (a[i - 1] == b[j - 1]) {
                   
                    dp[i][j] = dp[i-1][j - 1];
                } else {
                    // If the last character is different, consider all
                    // possibilities and find the minimum
                    dp[i][j] = 1 + Math.min(
                        dp[i][j - 1], // Replace
                        Math.min(
                            dp[i-1 ][j], // Remove
                            dp[i-1][j - 1] // Insert
                        )
                    );
                }
            }
        }
        return dp[n][m];
    }

}
