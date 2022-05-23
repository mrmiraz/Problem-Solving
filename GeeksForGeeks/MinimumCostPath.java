/*
problem: Given a square grid of size N, each cell of which contains integer cost which represents a cost to traverse through that cell,
we need to find a path from top left cell to bottom right cell by which the total cost incurred is minimum.
From the cell (i,j) we can go (i,j-1), (i, j+1), (i-1, j), (i+1, j). 

Note: It is assumed that negative cost cycles do not exist in the input matrix.
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
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int[][] grid = new int[n][n];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            int ans = obj.minimumCostPath(grid);
            System.out.println(ans);
        }
    }
}// } Driver Code Ends


class Solution
{
    //Function to return the minimum cost to react at bottom
	//right cell from top left cell.
    class Node{
        int connectedNode;
        int weight;
        Node(int connectedNode, int weight){
            this.connectedNode = connectedNode;
            this.weight = weight;
        }
    }
    
    
    ArrayList<Node> graph[];
    
    int[] dist;
    boolean[] relax;
    int v;
    PriorityQueue<Node> pq;
     
     
    int dijkstra(int source, int destination, int[][] grid){
        
        dist[source] = grid[0][0];
        pq.add(new Node(source, dist[source]));
            Node curNode = pq.poll();
            relax[curNode.connectedNode] = true;
            for(Node child: graph[curNode.connectedNode]){
                if(!relax[child.connectedNode] && dist[curNode.connectedNode] + child.weight < dist[child.connectedNode]){
                   dist[child.connectedNode]= dist[curNode.connectedNode] + child.weight;
                   pq.add(new Node(child.connectedNode, dist[child.connectedNode]));
                   
                }
            }
        }
        
        return dist[v-1];
        
    }       
        while(!pq.isEmpty()){
            Node curNode = pq.poll();
            relax[curNode.connectedNode] = true;
            for(Node child: graph[curNode.connectedNode]){
                if(!relax[child.connectedNode] && dist[curNode.connectedNode] + child.weight < dist[child.connectedNode]){
                   dist[child.connectedNode]= dist[curNode.connectedNode] + child.weight;
                   pq.add(new Node(child.connectedNode, dist[child.connectedNode]));
                   
                }
            }
        }
        
        return dist[v-1];
        
    }
    
    public int minimumCostPath(int[][] grid)
    {
        int N = grid.length;
        int M = N;
        v = N*M;
        int[] x ={1, 0, -1, 0};
        int[] y = {0, -1, 0, 1};
        graph = new ArrayList[v];
        for(int i = 0; i < v; i++){
            graph[i] = new ArrayList<>();
        }
        
        dist = new int[v];
        Arrays.fill(dist, Integer.MAX_VALUE);
        relax = new boolean[v];
        
        pq =new PriorityQueue<>((a,b)->Integer.compare(a.weight, b.weight));
        
        for(int i =0; i < N; i++){
            for(int j =0; j < M; j++){
                // adding node which are connected
                int node = i*M+j;
                for(int k = 0; k < 4; k++){
                    int xi = i+x[k];
                    int yi = j + y[k];
                    if(xi >= 0 && yi >= 0 && xi <N && yi < M){
                        graph[node].add(new Node(xi*M+yi, grid[xi][yi]));
//                        graph[node].add(xi*M+yi);
                    }

                }
            }
        }
        
        return dijkstra(0, v-1, grid);
    }
}
