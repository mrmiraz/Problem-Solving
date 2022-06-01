/*
problem:
Given an array of non-negative integers, and a value sum, determine if there is a subset of the given set with sum equal to given sum. 


Example 1:

Input:
N = 6
arr[] = {3, 34, 4, 12, 5, 2}
sum = 9
Output: 1 
Explanation: Here there exists a subset with
sum = 9, 4+3+2 = 9

*/

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            int sum = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            if(ob.isSubsetSum(N, arr, sum))
            System.out.println(1);
            else
            System.out.println(0);

            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{

    
    public static boolean isSubsetSum( int[] set, int sum){
         int length = set.length;
         boolean[][] dp = new boolean[length+1][sum+1];
         Arrays.fill(dp[0], false);
         for(int i = 0; i <= length; i++){
             dp[i][0] = true;
         }
         
         for(int i = 1; i <= length; i++){
             for(int j = 1; j <= sum; j++){
                 // element is not encluding
                 dp[i][j] = dp[i-1][j];
                 int element = set[i-1];
                 if(element <= j){
                     //element is encluding
                     dp[i][j] = dp[i][j] || dp[i-1][j - element];
                 }
             }
         }
         
         return dp[length][sum];
    }
    
    static Boolean isSubsetSum(int N, int arr[], int sum){
        return isSubsetSum(arr, sum);
    }
    
    
}
