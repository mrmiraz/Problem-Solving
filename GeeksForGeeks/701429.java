/*
Problem: Given two sequences, find the length of longest subsequence present in both of them. Both the strings are of uppercase.

*/



import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {

		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-- > 0){
		    int p=sc.nextInt();             // Take size of both the strings as input
		    int q=sc.nextInt();
		    
		    String s1=sc.next();            // Take both the string as input
	        String s2=sc.next();
		    
		    Solution obj = new Solution();
		    
		    System.out.println(obj.lcs(p, q, s1, s2));
		}
	}
}// } Driver Code Ends


class Solution
{
    public static int backTrack(int[][] dp, char[] s1, char[] s2){
        int m = dp.length;
        int n = dp[0].length;
        for(int i =1; i < m ;i++){
            for(int j = 1;j < n; j++){
                if(s1[i-1]==s2[j-1]){
                    dp[i][j] = 1+dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        return dp[m-1][n-1];
    }
    
    static int lcs(int x, int y, String s1, String s2)
    {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        int[][] dp = new int[c1.length+1][c2.length+1];
        return backTrack(dp, c1, c2);
//        return backTrack(c1, c2, x, y);
    }
    
}
