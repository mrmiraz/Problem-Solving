/*
Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...
 

Example 1:

Input: columnTitle = "A"
Output: 1

*/

class Solution {
    public int titleToNumber(String columnTitle) {
        char[] strArr = columnTitle.toCharArray();
        int sum = 0, j = strArr.length-1;
        for(int i = 0; i < strArr.length; i++){
            sum += (strArr[i]-'A'+1) * Math.pow(26, j--);
        }
        return sum;
    }
}
