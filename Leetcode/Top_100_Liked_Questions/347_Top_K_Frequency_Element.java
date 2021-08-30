class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        // collect frequency for each number in map
        for(int value: nums){
            map.put(value, map.getOrDefault(value, 0)+1);
        }
        
        
        LinkedList<Integer>[] freqArray = new LinkedList[nums.length+1];
        // put all number by frequency in a frequency array
        for(int key: map.keySet()){
            int freq = map.get(key);
            if(freqArray[freq] == null){
                freqArray[freq] = new LinkedList<>();
            }
            freqArray[freq].add(key);
        }
        
        // getting most frequency value;
        for(int i = nums.length; i >= 1; i--){
            if(freqArray[i] != null){
                while(k > 0 && !freqArray[i].isEmpty()){
                result[--k] = freqArray[i].removeLast();
            }
            }
            
        }
        return result;
    }
}

//https://www.youtube.com/watch?v=YPTqKIgVk-k