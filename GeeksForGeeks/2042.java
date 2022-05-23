
/*
Problem: The problem is to find shortest distances between every pair of vertices in a given edge weighted directed Graph.
The Graph is represented as adjancency matrix, and the matrix denotes the weight of the edegs (if it exists) else -1. Do it in-place.

*/


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[][] matrix = new int[n][n];
            for(int i = 0; i < n; i++){
                String[] s = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++)
                    matrix[i][j]  =Integer.parseInt(s[j]);
            }
            Solution obj = new Solution();
            obj.shortest_distance(matrix);
            for(int i = 0; i < n; i++){
                for(int j  = 0; j < n; j++){
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


//User function template for JAVA

class Solution
{
    int INF = 99999;
    public void shortest_distance(int[][] matrix)
    {
        int V = matrix.length;
        for(int i =0; i <V; i++){
            for(int j =0; j < V; j++){
                if(i == j)continue;
                if(matrix[i][j] == -1)matrix[i][j] = INF;
            }
        }
        
        for(int k = 0; k < V; k++){
            for(int i = 0; i < V; i++){
                for(int j = 0; j < V; j++){
                    matrix[i][j] = Math.min(matrix[i][j], matrix[i][k]+matrix[k][j]);
                }
            }
        }
        
        for(int i =0; i <V; i++){
            for(int j =0; j < V; j++){
                if(i == j)continue;
                if(matrix[i][j] == INF)matrix[i][j] = -1;
            }
        }
    }
}
