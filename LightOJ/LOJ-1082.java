/*
Problem:
Given an array with N elements, indexed from 1 to N. Now you will be given some queries in the form I J, your task is to find the minimum value from index I to J.

Input
Input starts with an integer T (≤ 5), denoting the number of test cases.

The first line of a case is a blank line. The next line contains two integers N (1 ≤ N ≤ 105), q (1 ≤ q ≤ 50000). The next line contains N space separated integers forming the array. There integers range in [0, 105].

The next q lines will contain a query which is in the form I J (1 ≤ I ≤ J ≤ N).

Output
For each test case, print the case number in a single line. Then for each query you have to print a line containing the minimum value between index I and J.

Input
2

5 3
78 1 22 12 3
1 2
3 5
4 4

1 1
10
1 1

output
Case 1:
1
3
12
Case 2:
10
*/
import java.util.*;
import java.io.*;
import java.lang.*;

public class Main{
    static Scanner sc = new Scanner(System.in);
    static int[] tree,arr;
    public static void init(int node, int b, int e){
        if(b == e){
            tree[node] = arr[b-1];
            return;
        }
        int left = node*2, right = node*2+1;
        int mid = (b+e)/2;
        init(left, b, mid);
        init(right, mid+1, e);
        tree[node] = Math.min(tree[left] ,tree[right]);
    }

    public static int query(int node, int b, int e, int lb, int rb){
        if(b > rb || e < lb){
            return Integer.MAX_VALUE;
        }
        if(b >= lb && e <= rb){
            return tree[node];
        }
        int left = node*2, right = node*2+1;
        int mid = (b+e)/2;
        return Math.min(query(left, b, mid, lb, rb) , query(right, mid+1, e, lb, rb));
    }

    public static void solver(){
        int n = sc.nextInt(), q = sc.nextInt();
        arr = new int[n];
        int x = (int)Math.ceil(Math.log(n)/Math.log(2));
        int maxSize = 2*(1<<x);
        tree = new int[maxSize];
        for(int i = 0;i < n; i++){
            arr[i] = sc.nextInt();
        }
        init(1, 1, n);
        for(int i = 0; i < q; i++){
            int lb = sc.nextInt(), rb = sc.nextInt();
            System.out.println(query(1, 1, n, lb, rb));
        }
    }

    public static void main(String[] args){
        int t = sc.nextInt();
        int n = 1;
        while(n <= t){
            System.out.println("Case "+n + ": ");
            solver();
            n++;
        }
    }
}
