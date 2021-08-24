class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        // put value all left side product
        result[0] = 1;
        for(int i = 1; i < nums.length; i++){
            result[i] = nums[i-1]*result[i-1];
        }
        // put value all right side product * left side product
       int right = 1;
         for(int i = nums.length-1; i >= 0; i--){
             result[i] = result[i]*right;
             right = right*nums[i];
         }
        return result;
    }
}
