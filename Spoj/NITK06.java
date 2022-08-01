/*
problem:
Suppose we have a sequence of non-negative integers, Namely a1, a2, ..., an. At each time we can choose one term ai with 0 < i < n and we subtract 1 from both ai and ai+1. We wonder whether we can get a sequence of all zeros after several operations.

Input
The first line is the number of test cases T (0 < T <= 20).

The first line of each test case is a number N (0 < N <= 10000). The next line is N non-negative integers, 0 <= ai <= 109.

Output
If it can be modified into all zeros with several operations output “YES” in a single line, otherwise output “NO” instead.

Example
Input:
2
2
1 2
2
2 2

Output:
NO
YES
*/

import java.util.*;
import java.lang.*;

class Main
{
	static Scanner sc = new Scanner(System.in);
	public static void solver(){
		int n = sc.nextInt();
		int dif = 0;
		for(int i = 0; i < n; i++){
			int num = sc.nextInt();
			dif = num - dif;
			
		}
		if(dif == 0){
			System.out.println("YES");
			
		}
		else{
			System.out.println("NO");
		}
	}
	
	
	public static void main (String[] args) throws java.lang.Exception
	{
		int t = sc.nextInt();
		while(t-->0){
			solver();
		}
	}
}
