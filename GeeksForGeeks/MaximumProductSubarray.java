/*
Problem:
Given an array Arr[] that contains N integers (may be positive, negative or zero). Find the product of the maximum product subarray.

Example 1:

Input:
N = 5
Arr[] = {6, -3, -10, 0, 2}
Output: 180
Explanation: Subarray with maximum product
is [6, -3, -10] which gives product as 180.
*/
//{ Driver Code Starts
import java.io.*;
import java.util.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(new Solution().maxProduct(arr, n));
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        long ans = arr[0], maxV = arr[0], minV = arr[0];
        for(int i = 1; i < n; i++){
            if(arr[i] < 0){
               long temp = maxV;
               maxV = minV;
               minV = temp;
            }
            
            maxV = Math.max((long)arr[i], maxV*arr[i]);
            minV = Math.min((long)arr[i], minV*arr[i]);
            ans = Math.max(maxV, ans);
        }
        return ans;
    }
}
