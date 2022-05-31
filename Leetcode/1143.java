/*
Problem:
Given two strings text1 and text2, return the length of their longest common subsequence. If there is no common subsequence, return 0.

A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order
of the remaining characters.

For example, "ace" is a subsequence of "abcde".
A common subsequence of two strings is a subsequence that is common to both strings.

Example 1:

Input: text1 = "abcde", text2 = "ace" 
Output: 3  
Explanation: The longest common subsequence is "ace" and its length is 3.
*/

class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        char[] s2 = text1.toCharArray();
        char[] s1 = text2.toCharArray();
        int m = s1.length, n = s2.length;
        int[][] dp = new int[m+1][n+1];
        return lcsTabular(dp,s1, s2, m, n);
    }
    
    public static int lcsTabular(int[][] dp, char[] s1, char[] s2, int m, int n){
        
        for(int i =1; i <= m ;i++){
            for(int j = 1;j <= n; j++){
                if(s1[i-1]==s2[j-1]){
                    dp[i][j] = 1+dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        return dp[m][n];
    }
}
