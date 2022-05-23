/*
Problem: Given a grid of size n*n filled with 0, 1, 2, 3. Check whether there is a path possible from the source to destination. You can traverse up, down, right and left.
The description of cells is as follows:

A value of cell 1 means Source.
A value of cell 2 means Destination.
A value of cell 3 means Blank cell.
A value of cell 0 means Wall.
Note: There are only a single source and a single destination.

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
            int[][] grid = new int[n][n];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            boolean ans = obj.is_Possible(grid);
            if(ans)
                System.out.println("1");
            else 
                System.out.println("0");
        }
    }
}// } Driver Code Ends




class Solution
{
    
    Queue<Integer> q;
    boolean[] visited;
    ArrayList<Integer> graph[];
    
     boolean bfs( int source, int destination){
        // add the source node and mark as visited node
        q.add(source);
        visited[source] = true;
        // iterate until the queue is empty
        while(!q.isEmpty()){
            int curNode = q.poll();
            if(curNode == destination)return true;
            //Go through all neighbore of poll vertex of the queue
            for(int neighbore : graph[curNode]){
                //if neighbore is not visite add it to the queue and mark as visited
                if(!visited[neighbore]){
                    visited[neighbore] = true;
                    q.add(neighbore);
                }
            }
        }
        return false;
    }
     
      public boolean is_Possible(int[][] grid)
    {
        int N = grid.length;
        int M = grid.length;
        int source = -1, destination = -1;
        visited = new boolean[N*M];
        q = new LinkedList<>();
        graph = new ArrayList[N*M];
        
        int[] x ={1, 0, -1, 0};
        int[] y = {0, -1, 0, 1};
        
        
        for(int i = 0; i < N*M; i++){
            graph[i] = new ArrayList<>();
        }
        
        for(int i = 0; i < N; i++){
            for(int j =0; j < M; j++){
                // adding node which are connected
                if(grid[i][j] != 0){
                    int node = i*M+j;
                    if(grid[i][j] == 1)source = node;
                    if(grid[i][j] == 2)destination = node;
                    for(int k = 0; k < 4; k++){
                        int xi = i+x[k];
                        int yi = j + y[k];
                        if(xi >= 0 && yi >= 0 && xi < N && yi < M && grid[xi][yi] != 0){
                            graph[node].add(xi*M+yi);
                        }
                    
                    }
                }                
                
            }
        }
        return bfs(source, destination);
    }
}
