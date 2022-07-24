/*
Problem:
Given an array A of size N, print the reverse of it.

Example:

Input:
1
4
1 2 3 4
Output:
4 3 2 1

*/
import java.lang.*;
import java.io.*;
class GFG
 {
     static Scanner sc = new Scanner(System.in);
     public static void solver(){
        int n = sc.nextInt();
	    int[] arr =new int[n];
	    for(int i = 0; i < n; i++){
	        arr[i] = sc.nextInt();
	    }
	    reverse(arr);
	    for(int i =0; i < n; i++){
	        System.out.print(arr[i] + " ");
	    }
	    System.out.println("");
     }
     public static void reverse(int[] arr){
         int n = arr.length;
         for(int i =0; i < n/2; i++){
             int temp = arr[i];
             arr[i] = arr[n-i-1];
             arr[n-i-1] = temp;
         }
     }
	public static void main (String[] args)
	 {
	     int t = sc.nextInt();
	     while(t-- > 0){
	         solver();
	     }
	 }
}
