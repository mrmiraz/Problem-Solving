class Solution {
    public int maximalSquare(char[][] matrix) {
         int row = matrix.length;
         int col = matrix[0].length;
        int[][] dp = new int[row +1][col+1];
        // full dp row one with zero
        for(int i = 0; i <= row; i++){
            dp[i][0] = 0;
        }
        // full dp col one with zero
        for(int i = 0; i <= col; i++){
            dp[0][i] = 0;
        }
        int largest = 0;
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= col; j++){
                if(matrix[i-1][j-1] == '1'){
                    // finding minimun of upper, left and upper diagonal value and add 1
                    dp[i][j] = 1 + Math.min(dp[i-1][j], Math.min(dp[i][j-1], dp[i-1][j-1]));
                }
                else{
                    dp[i][j] = 0;
                }
                largest = Math.max(largest, dp[i][j]);
            }
        }
        return largest*largest;
    }
}

//https://www.youtube.com/watch?v=RElcqtFYTm0