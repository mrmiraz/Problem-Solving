import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       for(int i = 0 ;i < t; i++){
           int n = sc.nextInt();
           int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
           for(int j = 0 ;j < n ;j++){
               int a = sc.nextInt();
               max = Math.max(a, max);
               min = Math.min(a, min);
           }
           System.out.println((int)(max - min));
       }
    }
}
