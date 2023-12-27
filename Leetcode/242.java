/**
 Given two strings s and t, return true if t is an anagram of s, and false otherwise.

 An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.



 Example 1:

 Input: s = "anagram", t = "nagaram"
 Output: true
 **/

public class Solution {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())return false;
        int[] countArr = new int[26];
        for(char i : s.toCharArray()){
            countArr[i - 'a']++;
        }

        for(char i : t.toCharArray()){
            countArr[i - 'a']--;
            if(countArr[i-'a'] < 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "rat", t = "car";
        System.out.println(isAnagram(s, t));
    }
}
