/*
problem: Given a Directed Graph with V vertices (Numbered from 0 to V-1) and E edges, check whether it contains any cycle or not.
*/

import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for (int i = 0; i < V + 1; i++)
                list.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if (new Solution().isCyclic(V, list) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}// } Driver Code Ends


/*Complete the function below*/

class Solution {
    // Function to detect cycle in a directed graph.
    ArrayList<ArrayList<Integer>> adjList;
    
    public boolean dfs(boolean[] visited,boolean[] inRecStack, int curVertex){
        visited[curVertex] = true;
        inRecStack[curVertex] = true;
        for(int child: adjList.get(curVertex)){
            if(!visited[child]){
               if(dfs(visited, inRecStack, child))return true;
            }
            else if(inRecStack[child])return true;
        }
        inRecStack[curVertex] = false;
        return false;
    }
    
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        this.adjList = adj;
        boolean[] visited = new boolean[V];
        boolean[] inRecStack = new boolean[V];
        for(int i =0; i < V; i++){
            if(!visited[i]){
                if(dfs(visited,inRecStack, i))return true;
            }
        }
        return false;
    }
}
