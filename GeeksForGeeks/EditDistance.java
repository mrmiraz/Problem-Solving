/*
Given two strings s and t. Return the minimum number of operations required to convert s to t.
The possible operations are permitted:

Insert a character at any position of the string.
Remove any character from the string.
Replace any character from the string with any other character.
 

Example 1:

Input: 
s = "geek", t = "gesek"
Output: 1
Explanation: One operation is required 
inserting 's' between two 'e's of str1.
*/
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String s1 = br.readLine();
            String[] S = s1.split(" ");
            String s = S[0];
            String t = S[1];
            Solution ob = new Solution();
            int ans = ob.editDistance(s, t);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution {
    public int minDistance(int[][] dp, char[] c1, char[] c2){
        int m = c1.length;
        int n = c2.length;
        for(int  i = 0; i <= m; i++){
            for(int j = 0; j <= n; j++){
                if(i == 0)dp[i][j] = j;
                else if(j == 0) dp[i][j] = i;
                else if(c1[i-1] == c2[j-1]){
                    dp[i][j] = dp[i-1][j-1];
                }
                else{
                    dp[i][j] = 1+Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1]));
                }
            }
        }
        return dp[m][n];
    }
    
    public int editDistance(String s, String t) {
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();
        return minDistance(new int[c1.length+1][c2.length+1], c1, c2);
    }
}
