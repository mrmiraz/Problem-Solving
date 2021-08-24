// Solution with priority queue
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < nums.length; i++){
            pq.add(nums[i]);
        }
        k = nums.length - k;
        int ans = pq.poll();
        while(k != 0){
           ans = pq.poll();
           k--;
        }
        return ans;
    }
}

// Solution with build in sort method
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}