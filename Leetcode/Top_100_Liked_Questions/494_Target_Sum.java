package learning.Solution;

public class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        if(nums.length == 0)return 0;
        return backtrack(0, 0, target, nums);   
    }
    public int backtrack(int total, int index, int target, int[] nums){
        if(index == nums.length&& total == target)return 1;
        else if(index == nums.length && total != target)return 0;
        
        int ans = backtrack(total + nums[index], index+1, target, nums) + backtrack(total-nums[index], index+1, target, nums);
        return ans;
    }
    
}