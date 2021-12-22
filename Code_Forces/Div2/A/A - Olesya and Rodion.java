import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int a = 1;
        if(n == 1 && t == 10){
            System.out.println("-1");
        }
        else{
            System.out.print(t);
            if(t == 10) a++;
            for(;a < n; a++){
                System.out.print('0');
            } 
        }
    }
}
