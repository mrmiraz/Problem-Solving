import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt(), sum = 0;
       int[] arr = new int[n];
       int max = Integer.MIN_VALUE;
       for(int i = 0; i < n;i++){
           arr[i] = sc.nextInt();
           max = Math.max(max, arr[i]);
       }
       
       for(int i = 0; i < n; i++){
           sum += max - arr[i];
       }
        System.out.println(sum);
    }
}
