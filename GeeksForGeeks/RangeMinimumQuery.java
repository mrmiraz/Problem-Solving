/*
Problem:
Given an array A[ ] and its size N your task is to complete two functions  a constructST  function which builds the segment tree  and a function RMQ which finds range minimum query in a range [a,b] of the given array.

Input:
The task is to complete two functions constructST and RMQ.
The constructST function builds the segment tree and takes two arguments the array A[ ] and the size of the array N.
It returns a pointer to the first element of the segment tree array.
The RMQ function takes 4 arguments the first being the segment tree st constructed, second being the size N and then third and forth arguments are the range of query a and b. The function RMQ returns the min of the elements in the array from index range a and b. There are multiple test cases. For each test case, this method will be called individually.

Output:
The function RMQ should return the min element in the array from range a to b.

Example:

Input (To be used only for expected output) 
1
4
1 2 3 4
2
0 2 2 3
Output
1 3
Explanation
1. For query 1 ie 0 2 the element in this range are 1 2 3 
   and the min element is 1. 
2. For query 2 ie 2 3 the element in this range are 3 4 
   and the min element is 3.
*/
//{ Driver Code Starts
import java.util.*;
import java.lang.*;

class Minimum
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
              arr[i] = sc.nextInt();
              
              GfG gfg = new GfG();
            int Q = sc.nextInt();
            
            
            int st[] = gfg.constructST(arr, n);
            int l,r;
            for(int i = 0; i < Q; i++)
            {
                int a = sc.nextInt();
                int b = sc.nextInt();
                l = Math.min(a,b);
                r = Math.max(a,b);
                
                System.out.print(gfg.RMQ(st, n, l, r) + " ");
                
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


/* The functions which 
builds the segment tree */
class GfG
{
    static int st[];
    public static void init(int[] arr, int node, int b, int e){
        if(b == e){
            st[node] = arr[b-1];
            return;
        }
        int left = 2*node, right = 2*node+1;
        int mid = (b+e)/2;
        init(arr, left, b, mid);
        init(arr, right, mid+1, e);
        st[node] = Math.min(st[left], st[right]);
    }
    
    public static int[] constructST(int arr[], int n)
    {
        int x = (int)Math.ceil(Math.log(n)/Math.log(2));
        int maxSize = 2*(1<<x);
        st = new int[maxSize];
        init(arr, 1, 1, n);
        return st;
    }
    
    public static int query(int node, int b, int e, int lb, int rb){
        if(b > rb || e < lb){
            return Integer.MAX_VALUE;
        }
        if(b >= lb && e <= rb){
            return st[node];
        }
        int left = (2*node),  right = 2*node+1;
        int mid = (b+e)/2;
        return Math.min(query(left, b, mid, lb,  rb), query( right, mid+1, e, lb, rb));
    }
    /* The functions returns the
      min element in the range
      from l and r */
    public static int RMQ(int st[], int n, int l, int r)
    {
       return query(1, 1, n, l+1, r+1);
    }
    
    
}
