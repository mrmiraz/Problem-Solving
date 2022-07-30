/*
Problem:
Robin Hood likes to loot rich people since he helps the poor people with this money. Instead of keeping all the money together he does another trick. 
He keeps n sacks where he keeps this money. The sacks are numbered from 0 to n-1.

Now each time he can he can do one of the three following tasks:

Give all the money of the ith sack to the poor, leaving the sack empty.
Add new amount (given in input) in the ith sack.
Find the total amount of money from ith sack to jth sack.
Since he is not a programmer, he seeks your help.
Input
Input starts with an integer T (≤ 5), denoting the number of test cases.

Each case contains two integers n (1 ≤ n ≤ 105) and q (1 ≤ q ≤ 50000). The next line contains n space separated integers in the range [0, 1000].
The ith integer denotes the initial amount of money in the ith sack (0 ≤ i < n).

Each of the next q lines contains a task in one of the following form:

1 i - give all the money of the ith.
2 i v - add money v (1 ≤ v ≤ 1000) to the ith (0 ≤ i < n) sack.
3 i j - find the total amount of money from the ith sack to the jth sack (0 ≤ i ≤ j < n).
Output
For each test case, print the case number first. If the query type is 1, then print the amount of money given to the poor. 
If the query type is 3, print the total amount from ith to jth sack.
Input
1
5 6
3 2 1 4 5
1 4
2 3 4
3 0 3
1 2
3 0 4
1 1
output
Case 1:
5
14
1
13
2
*/

import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{
    static Scanner sc = new Scanner(System.in);
    static int[] tree, arr;
    public static void init(int node, int b, int e){
        if(b == e){
            tree[node] = arr[b-1];
            return;
        }
        int left = node*2, right = node*2+1;
        int mid = (b+e)/2;
        init(left, b, mid);
        init(right, mid+1, e);
        tree[node] = tree[left]+tree[right];
    }

    public static void update(int node, int b, int e, int index, int newValue){
        if(b > index || e < index)
            return;
        if(b >= index && e <= index){
            if(newValue > 0){
                newValue += arr[b-1];
            }
            tree[node]= newValue;
            arr[b-1] = newValue;
            return;
        }
        int left = node*2, right = node*2+1;
        int mid = (b+e)/2;
        update(left, b, mid, index, newValue);
        update(right, mid+1, e, index, newValue);
        tree[node] = tree[left]+tree[right];
    }

    public static int query(int node, int b, int e, int lb, int rb){
        if(b > rb || e < lb)
            return 0;
        if(b >= lb && e <= rb){
            return tree[node];
        }
        int left = node*2, right = node*2+1;
        int mid = (b+e)/2;
        return query(left, b, mid,  lb, rb)+ query(right, mid+1, e, lb, rb);
    }

    public static void solver(){
        int n = sc.nextInt(), q = sc.nextInt();
        int x = (int)Math.ceil(Math.log(n)/Math.log(2));
        int maxValue = 2*(1<<x);
        tree = new int[maxValue];
        arr = new int[n];
        for(int i =0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        init(1, 1, n);
        for(int k =0; k < q; k++){
            int ctrl = sc.nextInt();
            if(ctrl == 1){
                int i = sc.nextInt();
                System.out.println(arr[i]);
                update(1, 1, n, i+1, 0);
            }
            else if(ctrl == 2){
                int i = sc.nextInt(), v = sc.nextInt();
                update(1, 1, n, i+1, v);
            }
            else{
                int i = sc.nextInt(), j = sc.nextInt();
                System.out.println(query(1, 1, n, i+1, j+1));
            }
        }
    }
    public static void main(String[] args){
        int t = sc.nextInt();
        int n = 1;
        while(n <= t){
            System.out.println("Case "+ n + ":");
            solver();
            n++;
        }
    }
}
