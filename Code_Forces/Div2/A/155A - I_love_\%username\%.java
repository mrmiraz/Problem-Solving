import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int max = sc.nextInt(), min = max, count = 0;
       for(int i = 1; i < n; i++){
           int a = sc.nextInt();
           if(a > max || a < min){
               count++;
               max = Math.max(max, a);
               min = Math.min(min, a);
           }
       }
        System.out.println(count);
    }
}
