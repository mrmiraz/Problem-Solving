import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt(), sum = 0;
       for(int i = 0; i < n; i++){
           int p = sc.nextInt();
           sum += p;
       }
        System.out.printf("%.12f",(double)sum/n);
    }
}
