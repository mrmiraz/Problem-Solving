import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       for(int i = 0; i < t; i++){
           int a = sc.nextInt();
           System.out.println(a%2 != 0? (a/2)+1:a/2);
       }
    }
}
