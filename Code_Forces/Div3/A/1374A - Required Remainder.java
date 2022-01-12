import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       for(int i = 0; i < t; i++){
           int x = sc.nextInt(), y = sc.nextInt(), n = sc.nextInt();
           int r = n/x;
           if(x*r+y > n)
               System.out.println(x*(r-1)+y);
           else
               System.out.println(x*r+y);
       }
    }
}
