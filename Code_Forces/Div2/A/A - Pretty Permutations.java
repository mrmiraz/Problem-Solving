import java.util.Scanner;

public class Solution {
    
    public static void solve(int start, int n){
        
        for(int i = start; i <= n; i+=2){
            
            if(start+1 != n)
                System.out.print((i+1) + " " + i + " ");
            else
                System.out.print(i+1 + " " + i);
        }
        
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       for(int i = 0; i < t; i++){
           int n = sc.nextInt();
           if(n % 2 == 0){
               solve(1, n);
           }
           else{
               System.out.print("3 1 2");
               if(n > 3){
                   System.out.print(" ");
                   solve(4, n);
               }
           }
           System.out.println();
       }
    }
}
