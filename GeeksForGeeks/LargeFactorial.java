/*
Problem:
Given an integer N, find its factorial.

Example 1:

Input: N = 5
Output: 120
Explanation : 5! = 1*2*3*4*5 = 120

*/
//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int N = sc.nextInt();
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.factorial(N);
            for (Integer val: ans) 
                System.out.print(val); 
            System.out.println();
        }   
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    
   static ArrayList<Integer> factorial(int N){
        java.math.BigInteger fact = new java.math.BigInteger("1");
        for(int i = 1; i <= N; i++){
            fact = fact.multiply(new java.math.BigInteger(""+i));
        }
        String ans = fact.toString();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i  = 0; i < ans.length(); i++){
            list.add(ans.charAt(i) - '0');
        }
        return list;
    }
}
