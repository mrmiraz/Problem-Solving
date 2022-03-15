/*
Replace Bits in N by M
You are given two 32-bits numbers, N and M, and two bits position i and j.
Write a mehtod to set all bits betwen i and j in N equal to M
M (becomes a substring of N locationed at and starting at j)

Example: 
N = 00000000000000000000000000001111
M = 00000000000000000000000000000010
i = 1, j = 2
output: 00000000000000000000000000001101
*/

import java.util.*;
public class RepalceWithNumber {
    public static int clearInRangeBits(int n, int i, int j){
        int a = (~0)<< j+1;
        int b = (1<<i)-1;
        int mask = a | b;
        return mask & n;
    }
    public static int replaceBits(int n, int m , int i, int j){
        n = clearInRangeBits(n, i, j);
        int mask = m << i;
        return mask | n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int i = sc.nextInt();
        int j = sc.nextInt();
        
        System.out.print(replaceBits(n, m,i, j));
    }
}
