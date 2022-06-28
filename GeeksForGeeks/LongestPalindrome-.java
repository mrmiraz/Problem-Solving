/*
Problem:
Given a string S, find the longest palindromic substring in S. Substring of string S: S[ i . . . . j ] where 0 ≤ i ≤ j < len(S). 
Palindrome string: A string which reads the same backwards. More formally, S is palindrome if reverse(S) = S. Incase of conflict, 
return the substring which occurs first ( with the least starting index).


Example 1:

Input:
S = "aaaabbaa"
Output: aabbaa
Explanation: The longest Palindromic
substring is "aabbaa".
*/

//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestPalin(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static String longestPalin(String S){
        int start = 0, end = 0;
        int n = S.length();
        for(int i = 0 ; i < n; i++){
            int len1 = match(S, i, i);
            int len2 = match(S, i, i+1);
            int len = Math.max(len1, len2);
            if(len > end-start+1){
                start = i - (len-1)/2;
                end = i + len/2;
            }
        }
        
        return S.substring(start,end+1);
    }
    
    public static int match(String s, int left, int right){
        int n = s.length();
        while(left >= 0 && right < n && s.charAt(left) == s.charAt(right)){
            left--;right++;
        }
        return right-left-1;
    }
}
