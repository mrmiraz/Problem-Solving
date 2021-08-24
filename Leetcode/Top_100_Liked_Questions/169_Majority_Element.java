class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int majority = nums[0];
        // majority should be more than n/2 times 
        for(int num : nums){
            count += num == majority? 1:-1;
            if(count == 0){
                majority = num;
                count++;
            }
        }
        return majority;
    }
}