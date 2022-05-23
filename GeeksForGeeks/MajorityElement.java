/*
Problem: Given an array A of N elements. Find the majority element in the array.
A majority element in an array A of size N is an element that appears more than N/2 times in the array.
 
*/
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int size)
    {
        int[] demo = new int[1000001];
        
        for(int i = 0; i < size; i++){
            demo[a[i]] = demo[a[i]]+1;
        }
        for(int i =0;i < size; i++){
            if(demo[a[i]] > size/2)return a[i];
        }
        return -1;
    }
    
}
