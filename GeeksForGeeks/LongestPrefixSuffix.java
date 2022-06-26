/*
Problem:
Given a string of characters, find the length of the longest proper prefix which is also a proper suffix.

NOTE: Prefix and suffix can be overlapping but they should not be equal to the entire string.

Example 1:

Input: s = "abab"
Output: 2
Explanation: "ab" is the longest proper 
prefix and suffix.
*/
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.lps(s));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    int lps(String s) {
        int l = s.length(), i = 1, j = 0;
        char[] txt = s.toCharArray();
        int[] lps = new int[l];
        lps[0] = 0;
        while(i < l){
            if(txt[i] == txt[j]){
                lps[i] = ++j;
                i++;
            }
            else if(j != 0){
                j = lps[j-1];
            }
            else {
                lps[i] = j;
                i++;
            }
        }
        return lps[l-1];
    }
}
