class Solution {
     public int numIslands(char[][] grid) {
        int island = 0;
        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[0].length; col++){
                if(grid[row][col] == '1'){
                    dfs(grid, row,col);
                    island++;
                }
            }
        }
        return island;
    }
    
    public void dfs(char[][] grid, int row, int col){
        if(row < 0 || col < 0 || row >= grid.length|| 
                col >= grid[0].length || grid[row][col] !=  '1')return;
        // put 2 which grid is visited or value is '1'
        grid[row][col] = '2';
        // check all four sides
        dfs(grid, row, col-1);
        dfs(grid, row-1, col);
        dfs(grid, row, col+1);
        dfs(grid, row+1, col);
    }
}

//https://www.youtube.com/watch?v=__98uL6wst8