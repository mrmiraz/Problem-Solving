//Initial Template for Java


/*
problem: A frog jumps either 1, 2, or 3 steps to go to the top. In how many ways can it reach the top. As the answer will be large find the answer modulo 1000000007.

Example 1:

Input:
N = 1
Output: 1
*/
import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main(String args[])
    {
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);
        
        //taking number of testcases
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            //taking number of steps in stair
            int n = sc.nextInt();
            
            //calling method countWays() of class Hops
            System.out.println(new Solution().countWays(n));
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to count the number of ways in which frog can reach the top.
    static long countWays(int n)
    {
        long mod = 1000000007;
        long[] dp = new long[n+1];
        dp[0] = 1;
        if(n >= 1)dp[1] = 1;
        if(n >= 2) dp[2] = 2;
        for(int i = 3; i <= n; i++){
            dp[i] = (dp[i-1]%mod + dp[i-2]%mod+ dp[i-3]%mod)%mod;
        }
        return dp[n];
    }
    
}

