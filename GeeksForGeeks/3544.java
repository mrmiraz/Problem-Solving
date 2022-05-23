/*
Problem: Given a 2D binary matrix A(0-based index) of dimensions NxM. Find the minimum number of steps required to reach from (0,0) to (X, Y).
Note: You can only move left, right, up and down, and only through cells that contain 1.

*/
// Initial Template for Java

import java.io.*;
import java.util.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N, M, x, y;
            String S[] = read.readLine().split(" ");
            N = Integer.parseInt(S[0]);
            M = Integer.parseInt(S[1]);
            int a[][] = new int[N][M];
            for (int i = 0; i < N; i++) {
                String s[] = read.readLine().split(" ");
                for (int j = 0; j < M; j++) a[i][j] = Integer.parseInt(s[j]);
            }
            String s1[] = read.readLine().split(" ");
            x = Integer.parseInt(s1[0]);
            y = Integer.parseInt(s1[1]);
            Solution ob = new Solution();
            System.out.println(ob.shortestDistance(N, M, a, x, y));
        }
    }
}// } Driver Code Ends



class Solution {
    
    
    int[] parent;
    Queue<Integer> q;
    boolean[] visited;
    ArrayList<Integer> graph[];
    
     int bfs( int source, int destination){
        // add the source node and mark as visited node
        q.add(source);
        visited[source] = true;
        parent[source] = -1;
        // iterate until the queue is empty
        while(!q.isEmpty()){
            int curNode = q.poll();
            
            //Go through all neighbore of poll vertex of the queue
            for(int neighbore : graph[curNode]){
                //if neighbore is not visite add it to the queue and mark as visited
                if(!visited[neighbore]){
                    visited[neighbore] = true;
                    q.add(neighbore);
                    parent[neighbore] = curNode;
                    
                }
            }
        }
        
        
        int x = destination;
        int dist = -1;
        while(x != -1){
            if(parent[x] == -2)return -1;
            dist++;
            x = parent[x];
        }
        return dist;
        
        
    }
    
    int shortestDistance(int N, int M, int A[][], int X, int Y) {
        
        if(A[0][0] != 1 || A[X][Y] != 1){
            return -1;
        }
        visited = new boolean[N*M];
        parent = new int[N*M];
        Arrays.fill(parent, -2);
        q = new LinkedList<>();
        
        int[] x ={1, 0, -1, 0};
        int[] y = {0, -1, 0, 1};
        graph = new ArrayList[N*M];
        
        for(int i = 0; i < N*M; i++){
            graph[i] = new ArrayList<>();
        }
        
        for(int i =0; i < N; i++){
            for(int j =0; j < M; j++){
                // adding node which are connected
                if(A[i][j] == 1){
                    int node = i*M+j;
                
                    for(int k = 0; k < 4; k++){
                        int xi = i+x[k];
                        int yi = j + y[k];
                        if(xi >= 0 && yi >= 0 && xi <N && yi < M && A[xi][yi] == 1){
                            graph[node].add(xi*M+yi);
                        }
                    
                    }
                }                
                
            }
        }
        
       int destination = X*M+Y;
        return bfs(0, destination);
        
    }
};
