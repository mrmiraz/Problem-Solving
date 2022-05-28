/*
Problem: Given an undirected graph with V vertices and E edges, check whether it contains any cycle or not. 
*/

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isCycle(V, adj);
            if (ans)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}// } Driver Code Ends


class Solution {
    ArrayList<ArrayList<Integer>> adjList;
    public boolean dfs(boolean visited[], int curVertex, int parent){
        visited[curVertex] = true;
        for(int child: adjList.get(curVertex)){
            if(!visited[child]){
                if(dfs(visited, child, curVertex))
                    return true;
            }
            // Child is already visited and child is not parent of current vertex
            else if(child != parent){
                return true;
            }
        }
        return false;
    }
    
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        this.adjList = adj;
        boolean visited[]  = new boolean[V];
        for(int i =0;i < V; i++){
            if(!visited[i]){
                if(dfs(visited, i, -1))return true;
            }
        }
        return false;
    }
}
