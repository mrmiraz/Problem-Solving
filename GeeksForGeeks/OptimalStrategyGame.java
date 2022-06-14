/*
Problem:
You are given an array A of size N. The array contains integers and is of even length. The elements of the array represent N coin of values V1, V2, ....Vn. You play against an opponent in an alternating way.

In each turn, a player selects either the first or last coin from the row, removes it from the row permanently, and receives the value of the coin.

You need to determine the maximum possible amount of money you can win if you go first.
Note: Both the players are playing optimally.

Example 1:

Input:
N = 4
A[] = {5,3,7,10}
Output: 15
Explanation: The user collects maximum
value as 15(10 + 5)
*/
import java.util.*;
import java.io.*;
import java.lang.*;

class OptimalStrategy
{
    public static void main (String[] args) {
        
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);
        
        //taking total number of testcases
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            //taking number of elements
            int n = sc.nextInt();
            int arr[] = new int[n];
            
            //inserting the elements
            for(int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
                
           //calling the countMaximum() method of class solve
           System.out.println(new solve().countMaximum(arr, n)); 
        }
    }
    
    
}// } Driver Code Ends



class solve
{
   public static int solve(int[] a,int[][] dp, int i, int j){
        if(i > j)return 0;
        if(dp[i][j] != -1)return dp[i][j];
        int x = a[i] + Math.min(solve(a, dp, i+2, j), solve(a,dp, i+1, j-1));
        int y = a[j] + Math.min(solve(a, dp, i+1, j-1), solve(a, dp, i, j-2));
        dp[i][j] = Math.max(x, y);
        return dp[i][j];
    }
    
    static long countMaximum(int arr[], int n)
    {
        
        int[][] dp = new int[n][n];
        for(int i =0; i < n; i++){
            for(int j = 0;j < n; j++){
                dp[i][j] = -1;
            }
        }
        return solve(arr, dp, 0, n-1);
    }
}
