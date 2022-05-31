/*
Problem: 
Given a string s, find the length of the longest substring without repeating characters.
Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
*/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> result = new HashMap<Character, Integer>();
        int len = 0, left = 0, right = 0;
        
        int n = s.length();
        while(right < n){
            
            if(result.containsKey(s.charAt(right))){
                left = Math.max(result.get(s.charAt(right))+1, left);
                
            }
            
            result.put(s.charAt(right), right);
            len = Math.max(len, right - left + 1);
            right++;
            
        }
        return len;
    }
}
