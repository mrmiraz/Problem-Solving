/*
Problem: Given an array nums of n elements and q queries . Each query consists of two integers l and r .
You task is to find the number of elements of nums[] in range [l,r] which occur atleast k times.
 

Example 1:

Input: nums = {1,1,2,1,3}, Queries = {{1,5},
{2,4}}, k = 1
Output: {3,2}
Explanation: For the 1st query, from l=1 to r=5
1, 2 and 3 have the frequency atleast 1.
For the second query, from l=2 to r=4, 1 and 2 have 
the frequency atleast 1.
*/
//Initial Template for Java

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
            String[] S = br.readLine().trim().split(" ");
            int n = Integer.parseInt(S[0]);
            int q = Integer.parseInt(S[1]);
            int k = Integer.parseInt(S[2]);
            int[] nums = new int[n];
            String[] S1 = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                nums[i] = Integer.parseInt(S1[i]);
            int[][] Queries = new int[q][2];
            for(int i = 0; i < q; i++){
                String[] S3 = br.readLine().trim().split(" ");
                for(int j = 0; j < S3.length; j++){
                    Queries[i][j] = Integer.parseInt(S3[j]);
                }
            }
            Solution obj = new Solution();
            int[] ans = obj.solveQueries(nums, Queries, k);
            for(int i = 0; i < ans.length; i++)
                System.out.println(ans[i]);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int[] solveQueries(int[] nums, int[][] Queries, int k)
    {
        int qLength = Queries.length;
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < qLength; i++){
            int l = Queries[i][0], r = Queries[i][1], count = 0;
            HashMap<Integer, Integer> map = new HashMap<>();
            HashSet<Integer> set = new HashSet<>();
            for(int j = l ; j <= r; j++){
                map.put(nums[j-1], map.get(nums[j-1]) == null?1:map.get(nums[j-1])+1);
                if(!set.contains(nums[j-1]) && map.get(nums[j-1]) >= k){
                    count++;
                    set.add(nums[j-1]);
                }
            }
            result.add(count);
        }
        int[] re = new int[result.size()];
        for(int i = 0; i < result.size();i++){
            re[i] = result.get(i);
        }
        return re;
    }
}
