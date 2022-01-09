import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt(), k = sc.nextInt();
       int r = 240 - k;
       int time = 0, count = 0;
       for(int i = 1; i <= n; i++){
           int last = 5*i;
           if(last <= r){
               r = r -last;
               count++;
           }
        }
        System.out.println(count);
    }
}
