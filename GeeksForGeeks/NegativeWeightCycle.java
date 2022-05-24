/*
Problem: Given a weighted directed graph with n nodes and m edges. 
Nodes are labeled from 0 to n-1, the task is to check if it contains a negative weight cycle or not.
Note: edges[i] is defined as u, v and weight.
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
            String[] S1 = br.readLine().trim().split(" ");
            int n = Integer.parseInt(S1[0]);
            int m = Integer.parseInt(S1[1]);
            int[][] edges = new int[m][3];
            for(int i = 0; i < m; i++){
                String S2[] = br.readLine().trim().split(" ");
                for(int j = 0; j < 3; j++)
                    edges[i][j] = Integer.parseInt(S2[j]);
            }
            Solution obj = new Solution();
            int ans = obj.isNegativeWeightCycle(n, edges);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    public int isNegativeWeightCycle(int n, int[][] edges)
    {
        int INF = 9999;
        int[] dist = new int[n];
        Arrays.fill(dist, INF);
        dist[0] = 0;
        int noe = edges.length;
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < noe; j++){
                int u = edges[j][0];
                int v = edges[j][1];
                int weight = edges[j][2];
                dist[v] = Math.min(dist[u]+weight, dist[v]);
            }
        }
        
        for(int i =0;i < noe; i++){
            int u = edges[i][0];
                int v = edges[i][1];
                int weight = edges[i][2];
                if(dist[u]+weight < dist[v])return 1;
        }
        return 0;
    }
    
}
