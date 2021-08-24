class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        // reverse entire array
        reverse(nums, 0, nums.length-1);
        // reverse from 0 to k-1 index from array
        reverse(nums, 0, k-1);
        // reverse from k to last index
        reverse(nums, k, nums.length-1);
    }
    public void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

//https://www.youtube.com/watch?v=BHr381Guz3Y