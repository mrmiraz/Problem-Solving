class Solution {
    
        public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        
        Arrays.fill(dp, Integer.MAX_VALUE);// fill all index with max value
            dp[0] = 0; // for amount zero initially its need zero coin
        for(int coin: coins){
            for(int j = coin; j <= amount; j++){
                if(dp[j-coin] != Integer.MAX_VALUE){//
                    dp[j] = Math.min(dp[j], 1+ dp[j-coin]);
                }
            }
        }
        return dp[amount] == Integer.MAX_VALUE? -1: dp[amount];
    }
    
}

//https://www.youtube.com/watch?v=J2eoCvk59Rc