/*
Problem:
Given a collection of Intervals, the task is to merge all of the overlapping Intervals.

Example 1:

Input:
Intervals = {{1,3},{2,4},{6,8},{9,10}}
Output: {{1, 4}, {6, 8}, {9, 10}}
Explanation: Given intervals: [1,3],[2,4]
[6,8],[9,10], we have only two overlapping
intervals here,[1,3] and [2,4]. Therefore
we will merge these two and return [1,4],
[6,8], [9,10].

*/

//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] s = br.readLine().trim().split(" ");
            int[][] Intervals = new int[n][2];
            int j = 0;
            for(int i = 0; i < n; i++){
                Intervals[i][0] = Integer.parseInt(s[j]);
                j++;
                Intervals[i][1] = Integer.parseInt(s[j]);
                j++;
            }
            Solution obj = new Solution();
            int[][] ans = obj.overlappedInterval(Intervals);
            for(int i = 0; i < ans.length; i++){
                for(j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution
{
    public int[][] overlappedInterval(int[][] Intervals)
    {
        Arrays.sort(Intervals, (a, b)-> {
            if(a[0] > b[0])return 1;
            if(a[0] == b[0]){
                if(a[1] < b[1])return 1;
            }
            return -1;
        });
        int mergeCount = 0;
        int len = Intervals.length;
        for(int i = 1; i < len; i++){
            if(Intervals[i][0] <= Intervals[i-1][1]){
                Intervals[i][0] = Intervals[i-1][0];
                Intervals[i][1] = Math.max(Intervals[i-1][1], Intervals[i][1]);
                //set previous to -1, means that is deleted
                Intervals[i-1][0] = -1;
                Intervals[i-1][1] = -1;
                mergeCount++;
            }    
        }
        
        int[][]  mergeIntervals = new int[len-mergeCount][2];
        int j = 0;
        for(int i = 0; i < len; i++){
            if(Intervals[i][0] != -1){
                mergeIntervals[j][0] = Intervals[i][0];
                mergeIntervals[j++][1] = Intervals[i][1];
            }            
        }
        
        return mergeIntervals;
        
    }
}
