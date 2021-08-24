class Solution {
     public int[] maxSlidingWindow(int[] nums, int k) {
        int length = nums.length;
        Deque<Integer> deque = new LinkedList<>();
        int[] result = new int[length-k+1];
        int resultIndex = 0;
        for(int i = 0; i < length; i++){
            // remove first deque number if it out of window boundary
            if(!deque.isEmpty() && deque.peekFirst() <= i-k)deque.removeFirst();
            //remove last number if current number > last number of deque
            while(!deque.isEmpty() && nums[i] > nums[deque.peekLast()]){
                deque.removeLast();
            }
            // add current number at last of deque
            deque.addLast(i);
            // check boundary and add first number of deque as result
            if(i >= k-1)
                result[resultIndex++] = nums[deque.peekFirst()];
            
        }
        return result;
    }
}
//https://www.youtube.com/watch?v=DfljaUwZsOk