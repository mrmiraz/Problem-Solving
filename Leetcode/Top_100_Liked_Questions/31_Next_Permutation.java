class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pointerIndex = -1;
        for(int i = n-1; i > 0; i--){
            if(nums[i] > nums[i-1]){
                pointerIndex = i;
                break;
            }
        }
        if(pointerIndex == -1){
            Arrays.sort(nums);
        }
        else{
            int nearestGreaterIndex = pointerIndex;
            for(int i = pointerIndex + 1; i < n; i++){
                if(nums[pointerIndex - 1] < nums[i] && nums[i] < nums[nearestGreaterIndex]){
                    nearestGreaterIndex = i;
                }
            }
            int temp = nums[pointerIndex -1];
            nums[pointerIndex - 1] = nums[nearestGreaterIndex];
            nums[nearestGreaterIndex] = temp;
            Arrays.sort(nums, pointerIndex, n);
        }
    }
}
