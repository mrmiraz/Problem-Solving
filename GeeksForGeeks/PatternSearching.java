/*
Problem:
Given a string str and a pattern pat. You need to check whether pattern is present or not in the given string. 

Input Format: The input line contains T, denoting the number of testcases. Each testcase contains two lines. First line contains string str. Second line contains patter text.

Output format: For each testcase in new line you have to print the "Present" if found otherwise "Not present".

User task: You need to complete the function searchPattern() containing string and text as an argument. You don't have to worry about input. 

Constraints:
1 <= T <= 100
1 <= |str| <= 30
1 <= |text| <= 30

Sample Input:
2
abcdefh
bcd
axzy
xy

Sample Output:
Present
Not present
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
            String input[] = read.readLine().split(" ");
            String text = input[0];
            String pattern = input[1];
            Solution ob = new Solution();
            System.out.println(ob.search(text,pattern));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    int search(String txt, String pat) {
        char[] text = txt.toCharArray();
        char[] pattern = pat.toCharArray();
        int l1 = text.length, l2 = pattern.length;
        for(int i = 0; i < l1; i++){
            int j = 0, k = i;
            for(; j < l2 && i+j < l1; j++){
                if(text[k++] != pattern[j]){
                    break;
                }
            }
            if(j == l2){
                return 1;
            }
        }
        return 0;
    }
    
};
