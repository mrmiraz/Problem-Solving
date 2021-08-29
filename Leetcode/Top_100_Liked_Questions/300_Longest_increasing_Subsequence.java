class Solution {
    public int lengthOfLIS(int[] nums) {
        // this dp will contain only increasing subsequence
        int[] dp = new int[nums.length+1];
        dp[1] = 100000;
        int maxSequence = 0;
        for(int i = 0; i < nums.length; i++){
            // j will find the position of increasing subsequence for nums[i]
            int j = maxSequence;
            // 
            while(j >= 1 && nums[i] <= dp[j])j--;
            j += 1;
            dp[j] = nums[i];
            maxSequence = Math.max(maxSequence, j);
        }
        return maxSequence;
    }
}