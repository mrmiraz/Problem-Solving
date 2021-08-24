class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int result = nums[0];
        for(int i = 1; i < nums.length; i++){
            int temp = max;
            // calculate the current max
            max = Math.max(max*nums[i], Math.max(min*nums[i], nums[i]));
            // calculate the current min
            min = Math.min(temp*nums[i], Math.min(min*nums[i], nums[i]));
            // store max vlaue between current max and previous result
            result = Math.max(max, result);
        }
        return result;
    }
}