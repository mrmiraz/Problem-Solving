class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int x: nums){
            sum += x;
        }
        if(sum % 2 != 0)return false;
        sum /= 2;
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int x: nums){
            HashSet<Integer> newSet = new HashSet<>();
            newSet.add(0);
            for(int setNumber: set){
                
                newSet.add(setNumber+x);
                newSet.add(setNumber);
                if(newSet.contains(sum))return true;
            }
            set = newSet;
            
        }
        if(set.contains(sum))return true;
        return false;
    }
}