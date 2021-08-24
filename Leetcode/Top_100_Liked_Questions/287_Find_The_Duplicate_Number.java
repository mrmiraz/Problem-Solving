
class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(visited[nums[i]])return nums[i];
            else{
                visited[nums[i]] = true;
            }
        }
        return -1;
    }
}

class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0], fast = nums[nums[0]]; // starts slow=nums[0], because there is no 0 value.
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        int finder = 0;
        while (slow != finder) {
            slow = nums[slow];
            finder = nums[finder];
        }
        return slow;
    }
}

//https://www.youtube.com/watch?v=dfIqLxAf-8s