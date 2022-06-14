/*
problem: 

Given a n*m matrix, find the maximum length path (starting from any cell) such that all cells along the path are in strictly increasing order.

We can move in 4 directions from a given cell (i, j), i.e., we can move to (i+1, j) or (i, j+1) or (i-1, j) or (i, j-1).
 

Example 1:

Input: matrix = {{1,2,9},{5,3,8},{4,6,7}}
Output: 7
Explanation: The longest increasing path is
{1,2,3,6,7,8,9}.

*/

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] S1 = br.readLine().trim().split(" ");
            int n  = Integer.parseInt(S1[0]);
            int m = Integer.parseInt(S1[1]);
            int[][] matrix = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S2 = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    matrix[i][j] = Integer.parseInt(S2[j]);
                }
            }
            Solution obj = new Solution();
            int ans = obj.longestIncreasingPath(matrix);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static int max(int a, int b, int c, int d){
        return Math.max(a, Math.max(b, Math.max(c, d)));
    }
    
    public static int findLongestFromCell(int[][] mat, int[][] dp,int i,int j, int n, int m){
        if(i < 0 || i >= n || j < 0 || j >= m){
            return 0;
        }
        if(dp[i][j] != -1)return dp[i][j];
        
//        int a = Integer.MIN_VALUE, b = Integer.MIN_VALUE, c = Integer.MIN_VALUE, d = Integer.MIN_VALUE;
        int a = 0, b = 0, c = 0, d = 0;
        //go to left adjacent
        if(j > 0 && mat[i][j] < mat[i][j-1]){
            a = findLongestFromCell(mat, dp, i, j-1, n, m);
        }
        //go to up adjacent
        if(i > 0 && mat[i][j] < mat[i-1][j]){
            b = findLongestFromCell(mat, dp, i-1, j, n, m);
        }
        
        // go to right adjacent
        if(j < m-1 && mat[i][j] <  mat[i][j+1]){
            c = findLongestFromCell(mat, dp, i, j+1, n, m);
        }
        
        //go to bottom adjacent
        if(i < n-1 && mat[i][j] < mat[i+1][j]){
            d = findLongestFromCell(mat, dp, i+1, j, n, m);
        }
        dp[i][j] = 1 + max(a, b, c,d);
        return dp[i][j];
        
    }
    
    public int longestIncreasingPath(int[][] matrix)
    {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] dp = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                dp[i][j] = -1;
            }
        }
        int result = 1;
        for(int i =0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(dp[i][j] == -1){
                    findLongestFromCell(matrix, dp, i, j, n, m);
                }
                result = Math.max(result, dp[i][j]);
            }
        }
        return result; 
    }
}
