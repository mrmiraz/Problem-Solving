class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> set=new HashSet<>();
        for(int i: nums){
            set.add(i);
        }
        int longestSequence = 0;
        
        for(int i : set){
            int curNumber = i;
            int curSequence = 1;
            if(!set.contains(curNumber-1)){
                while(set.contains(curNumber+1)){
                curNumber++;
                curSequence++;
            }
            }

            longestSequence = Math.max(longestSequence,curSequence);
        }
        return longestSequence;
    }
}

//https://www.youtube.com/watch?v=sHrb6phW3IA