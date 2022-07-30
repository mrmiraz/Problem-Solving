/*
Problem:
You are given an array arr[] of n integers and q queries in an array queries[] of length 2*q containing l, r pair for all q queries.
You need to compute the following sum over q queries.
Array is 1-Indexed.

Example 1:

Input: n = 4
arr = {1, 2, 3, 4}
q = 2
queries = {1, 4, 2, 3}
Output: 10 5
Explaination: In the first query we need sum 
from 1 to 4 which is 1+2+3+4 = 10. In the 
second query we need sum from 2 to 3 which is 
2 + 3 = 5.
*/
//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    static class FastReader{ 
		BufferedReader br; 
		StringTokenizer st; 
  
		public FastReader(){ 
			br = new BufferedReader(new InputStreamReader(System.in)); 
		} 
  
		String next(){ 
			while (st == null || !st.hasMoreElements()){ 
				try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
			} 
			return st.nextToken(); 
		} 
  
		String nextLine(){ 
			String str = ""; 
			try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
			return str; 
		} 
		
		int nextInt(){
		    return Integer.parseInt(next());
		}
	}
	
    public static void main(String args[])throws IOException
    {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0;i < n;i++)
                arr[i] = sc.nextInt();
            int q = sc.nextInt();
            int queries[] = new int[2*q];
            for(int i = 0;i < 2*q;i++)
                queries[i] = sc.nextInt();
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.querySum(n, arr, q, queries);
            StringBuilder out = new StringBuilder();
            for(int i = 0;i < ans.size();i++)
                out.append(ans.get(i) + " ");
            System.out.println(out);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int[] tree;
    public static void init(int[] arr, int node, int b, int e){
        if(b == e){
            tree[node] = arr[b-1];
            return;
        }
        int left = node*2, right = node*2+1;
        int mid = (b+e)/2;
        init(arr, left, b, mid);
        init(arr, right, mid+1, e);
        tree[node] = tree[left]+tree[right];
    }
    
    public static int query(int[] arr, int node, int b, int e, int lb, int rb){
        if(b > rb || e < lb)
            return 0;
        if(b >= lb && e <= rb){
            return tree[node];
        }
        int left = node*2, right = node*2+1;
        int mid =(b+e)/2;
        return query(arr, left, b, mid, lb, rb)+ query(arr, right, mid+1, e, lb, rb);
    }
    
    List<Integer> querySum(int n, int arr[], int q, int queries[])
    {
        int x = (int) (Math.ceil(Math.log(n) / Math.log(2)));
        int maxSize = 2*(1<<x);
        tree = new int[maxSize];
        init(arr, 1, 1, n);
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < 2*q; i+=2){
            int sum = query(arr, 1, 1, n, queries[i], queries[i+1]);
            result.add(sum);
        }
        return result;
    }
}
