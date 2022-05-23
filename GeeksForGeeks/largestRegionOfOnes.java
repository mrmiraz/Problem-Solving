/*
Problem: Given a grid of dimension nxm containing 0s and 1s. Find the unit area of the largest region of 1s.
Region of 1's is a group of 1's connected 8-directionally (horizontally, vertically, diagonally).
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
            int m = Integer.parseInt(s[1]);
            int[][] grid = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            int ans = obj.findMaxArea(grid);
            System.out.println(ans);
        }
    }
}// } Driver Code Ends


class Solution
{
    //Function to find unit area of the largest region of 1s.
    
    
    
    int dfs(int[][] grid, int x,int y, int N, int M){
        
        if(x < 0 || y < 0 || x >= N || y >= M || grid[x][y] != 1)return 0;
        grid[x][y] = 0;
        return 1+(dfs(grid,x+1, y, N, M) +
                dfs(grid,x-1, y, N, M)+
                dfs(grid,x, y+1, N, M) +
                dfs(grid,x, y-1, N, M) +
                dfs(grid,x+1, y+1, N, M) +
                dfs(grid,x+1, y-1, N, M) +
                dfs(grid,x-1, y+1, N, M) + 
                dfs(grid,x-1, y-1, N, M));
    }
    
    public int findMaxArea(int[][] grid)
    {
        int N = grid.length;
        int M = grid[0].length;
        int maxArea = 0;
        boolean[] visited = new boolean[M];
        for(int i =0; i < N; i++){
            for(int j = 0;j < M; j++){
                if(grid[i][j] == 1){
                    maxArea = Math.max(maxArea, dfs(grid, i, j, N, M));
                }
            }
        }
        return maxArea;
    }
}
