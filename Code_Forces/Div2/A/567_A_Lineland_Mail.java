package learning.Solution;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstLine = sc.nextLine();
        StringTokenizer st = new StringTokenizer(firstLine);
        int n = Integer.parseInt(st.nextToken());
        String nextLine = sc.nextLine();
        st = new StringTokenizer(nextLine);
        int[] arr = new int[n];
        int i = 0;
        while(st.hasMoreTokens()){
            arr[i] = Integer.parseInt(st.nextToken());
            i++;
        }
        for(i = 0; i < n; i++){
            int min;
            int max;
            if(i == 0){
                min = arr[1] - arr[i];
                max = arr[n-1] - arr[i];
            }
            else if( i == n-1){
                min = arr[i]- arr[i-1];
                max = arr[i] - arr[0];
            }
            else{
                min = Math.min(arr[i]-arr[i-1], arr[i+1] - arr[i]);
                max = Math.max(arr[i]- arr[0], arr[n-1]-arr[i]);
            }
            System.out.println(min+" "+ max);
        }
    }
    
}
