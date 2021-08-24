class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length+1];
        dp[0] = 0;
        dp[1] = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            dp[i+1] = Math.max(dp[i-1]+nums[i], dp[i]);
            
        }
        return dp[nums.length];
    }
}


////


class Solution {
    public int rob(int[] nums) {
        int ans = nums[0];
        
        int pre = 0;
        
        for(int i = 1; i < nums.length; i++){
            int cur = ans;
            ans = Math.max(nums[i]+pre, ans);
            pre = cur;
        }
        return ans;
    }
}