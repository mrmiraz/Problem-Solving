/*
Given a weighted, undirected and connected graph of V vertices and E edges, Find the shortest distance of all the vertex's from the source vertex S.
Note: The Graph doesn't contain any negative weight cycle.

*/



import java.lang.*;
import java.io.*;
import java.util.*;

class DriverClass
{
    public static void main(String args[]) throws IOException {

        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str[] = read.readLine().trim().split(" ");
            int V = Integer.parseInt(str[0]);
            int E = Integer.parseInt(str[1]);
    
            ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<ArrayList<ArrayList<Integer>>>();
            for(int i=0;i<V;i++)
            {
                adj.add(new ArrayList<ArrayList<Integer>>());
            }
            
            int i=0;
            while (i++<E) {
                String S[] = read.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                int w = Integer.parseInt(S[2]);
                ArrayList<Integer> t1 = new ArrayList<Integer>();
                ArrayList<Integer> t2 = new ArrayList<Integer>();
                t1.add(v);
                t1.add(w);
                t2.add(u);
                t2.add(w);
                adj.get(u).add(t1);
                adj.get(v).add(t2);
            }
            
            int S = Integer.parseInt(read.readLine());
            
            Solution ob = new Solution();
            
            int[] ptr = ob.dijkstra(V, adj, S);
            
            for(i=0; i<V; i++)
                System.out.print(ptr[i] + " ");
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
     static int findMin(int[] dist, boolean[] relax, int v){
        int minValue = Integer.MAX_VALUE, minIndex = -1;
        for(int i = 0; i < v; i++){
            if(!relax[i] && dist[i] < minValue){
                minValue = dist[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
       int[] dist = new int[V];
       Arrays.fill(dist, Integer.MAX_VALUE);
       boolean[] relax = new boolean[V];
       dist[S] = 0;
       for(int i =0; i < V-1; i++){
           int minNode = findMin(dist, relax, V);
           relax[minNode] = true;
           ArrayList<ArrayList<Integer>> neighbore = adj.get(minNode);
           
           for(ArrayList<Integer> list: neighbore){
               int v = list.get(0);
               int weight = list.get(1);
               if(!relax[v] && (dist[minNode]+weight) < dist[v]){
                   dist[v] = dist[minNode]+weight;
               }
           }
       }
       return dist;
       
    }
}
