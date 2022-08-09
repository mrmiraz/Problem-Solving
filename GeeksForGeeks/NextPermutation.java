/*
Problem:
Implement the next permutation, which rearranges the list of numbers into Lexicographically next greater permutation of list of numbers. If such arrangement is not possible, it must be rearranged to the lowest possible order i.e. sorted in an ascending order. You are given an list of numbers arr[ ] of size N.

Example 1:

Input: N = 6
arr = {1, 2, 3, 6, 5, 4}
Output: {1, 2, 4, 3, 5, 6}
Explaination: The next permutation of the 
given array is {1, 2, 4, 3, 5, 6}.
*/
//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(a[i]);
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.nextPermutation(N, arr);
            StringBuilder out = new StringBuilder();
            for(int i = 0;i < N;i++)
                out.append(ans.get(i) + " ");
            System.out.println(out);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    public static int findNearestGreater(int arr[], int sIndex, int eIndex){
        for(int i = eIndex; i > sIndex; i--){
            if(arr[i] > arr[sIndex]){
                return i;
            }
        }
        return sIndex;
    }
    
    public static void nextPermutation(int arr[]){
        int len = arr.length;
        for(int i = len-2; i >= 0; i--){
            if(arr[i] < arr[i+1]){
                // System.out.println(i);
                int ngIndex = findNearestGreater(arr, i, len-1);
                // System.out.println(ngIndex);
                int t = arr[ngIndex];
                arr[ngIndex] = arr[i];
                arr[i] = t;
                Arrays.sort(arr, i+1, len);
                return;
            }
        }
        Arrays.sort(arr);
    }
    
    static List<Integer> nextPermutation(int N, int arr[]){
        nextPermutation(arr);
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i =0; i < N; i++){
            ans.add(arr[i]);
        }
        return ans;
    }
}
