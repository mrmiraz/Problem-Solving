/*
Problem:
Given a sorted array of size N and an integer K, find the position at which K is present in the array using binary search.

Example 1:

Input:
N = 5
arr[] = {1 2 3 4 5} 
K = 4
Output: 3
Explanation: 4 appears at index 3.
*/
// Initial Template for Java

import java.io.*;
import java.util.*;

  public class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int key = sc.nextInt();
            Solution g = new Solution();
            System.out.println(g.binarysearch(arr, n, key));
            T--;
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int backtrack(int[] arr, int left, int right, int key){
        if(left > right)return -1;
        int mid = (left+right)/2;
        if(arr[mid] == key)return mid;
        if(key < arr[mid]){
            return backtrack(arr, left, mid-1, key);
        }
        else{
            return backtrack(arr, mid+1, right, key);
        }
        
    }
    
    int binarysearch(int arr[], int n, int k) {
        return backtrack(arr, 0, n-1, k);
    }
}
