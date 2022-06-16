/*
Problem:
A car factory has two assembly lines, and also given an  2D array a[2][] of size N which represent the time taken by each station. Each station is dedicated to some sort of work like engine fitting, body fitting, painting, and so on. So, a car chassis must pass through each of the n stations in order before exiting the factory. The two parallel assemble line perform same task.
From any line one can switch another line diagonally. A 2D array T[2][] of size N is also given, which represent  exit time to switch line 1 to line 2 diagonally.
Also each assembly line takes an entry time ei and exit time xi which may be different for the two lines.

For more clarity, refer the following diagram


The task is to computing the minimum time it will take to build a car chassis.
One can minimize the total time taken by performing following steps:

 A car chassis must pass through all stations from 1 to N in order(in any of the two assembly lines). i.e. it cannot jump from station i to station j if they are not at one move distance.
The car chassis can move one station forward in the same line, or one station diagonally in the other line. It incurs an extra cost Ti,j to move to station j from line i. No cost is incurred for movement in same line.
The time taken in station j on line i is ai, j.
Example 1:

Input: N = 4
a[2][] = {{4, 5, 3, 2}, 
      {2, 10, 1, 4}}
T[2][] = {{0,7, 4, 5},
           {0,9, 2, 8}}
e[2] = {10,12}, x[2] = {18,7}

Output: 35

*/

import java.io.*;
import java.util.*;


class IntMatrix
{
    public static int[][] input(BufferedReader br, int n, int m) throws IOException
    {
        int[][] mat = new int[n][];
        
        for(int i = 0; i < n; i++)
        {
            String[] s = br.readLine().trim().split(" ");
            mat[i] = new int[s.length];
            for(int j = 0; j < s.length; j++)
                mat[i][j] = Integer.parseInt(s[j]);
        }
        
        return mat;
    }
    
    public static void print(int[][] m)
    {
        for(var a : m)
        {
            for(int e : a)
                System.out.print(e + " ");
            System.out.println();
        }
    }
    
    public static void print(ArrayList<ArrayList<Integer>> m)
    {
        for(var a : m)
        {
            for(int e : a)
                System.out.print(e + " ");
            System.out.println();
        }
    }
}


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);
        
        return a;
    }
    
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n; 
            n = Integer.parseInt(br.readLine());
            
            
            int[][] a = IntMatrix.input(br, 2, n);
            
            
            int[][] T = IntMatrix.input(br, 2, n);
            
            
            int[] e = IntArray.input(br, 2);
            
            
            int[] x = IntArray.input(br, 2);
            
            Solution obj = new Solution();
            int res = obj.carAssembly(n, a, T, e, x);
            
            System.out.println(res);
            
        }
    }
}
// } Driver Code Ends


class Solution {
    public static int carAssembly(int n, int[][] a, int[][] T, int[] e, int[] x) {
       int stationNumber = n;
        int[] T1 = new int[stationNumber];
        int[] T2 = new int[stationNumber];
        T1[0] = e[0] + a[0][0];
        T2[0] = e[1] + a[1][0];
        
        for(int i =1 ;i < stationNumber; i++){
            T1[i] = Math.min(T1[i-1], T2[i-1]+T[1][i])+a[0][i];
            T2[i] = Math.min(T2[i-1], T1[i-1]+T[0][i]) + a[1][i];
        }

        return Math.min(T1[stationNumber-1]+x[0], T2[stationNumber-1]+x[1]);
    }
}
        
