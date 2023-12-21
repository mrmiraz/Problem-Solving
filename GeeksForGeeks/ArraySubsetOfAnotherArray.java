/**
 Given two arrays: a1[0..n-1] of size n and a2[0..m-1] of size m. Task is to check whether a2[] is a subset of a1[] or not.
 Both the arrays can be sorted or unsorted. There can be duplicate elements.

 Example 1:
 Input:
 a1[] = {11, 7, 1, 13, 21, 3, 7, 3}
 a2[] = {11, 3, 7, 1, 7}
 Output:
 Yes
 Explanation:
 a2[] is a subset of a1[]
 **/

import java.util.Arrays;

public class Solution {
    public static String isSubset( long a1[], long a2[], long n, long m) {
        if(m > n){
            return "No";
        }
        String retValue = "Yes";
        long[] sortedArr = new long[(int)Math.pow(10, 6)+1];
        for (int i = 0; i < a1.length; i++) {
            sortedArr[(int)a1[i]] += 1;
        }

        for (int i = 0; i < a2.length; i++) {
            if (sortedArr[(int) a2[i]] < 1){
                retValue = "No";
            }
            else {
                sortedArr[(int) a2[i]] -= 1;
            }
        }
        return retValue;
    }

    public static void main(String[] args) {
        long a1[] = {11, 7, 1, 13, 21, 3, 7, 3};
        long a2[] = {11, 3, 7, 1, 7};
        System.out.println(isSubset(a1, a2, a1.length, a2.length));
    }
}
