import java.util.Scanner;

public class Solution {
    
    public static void solve(int x, int y){
        int distance = x + y;
        if(distance % 2 != 0)
            System.out.println("-1 -1");
        else if(x >= y)
            System.out.println((distance/2)-y + " " + y);
        else 
            System.out.println(x + " " + ((distance/2)-x));
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       for(int i = 0; i < t; i++){
           int x =sc.nextInt(), y = sc.nextInt();
           solve(x, y);
       }
    }
}
