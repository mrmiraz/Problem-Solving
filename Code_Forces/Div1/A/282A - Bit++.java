import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        for(int i = 0; i < n; i++){
            char c = sc.next().charAt(1);
            if(c == '+')x++;
            else x--;
        }
        System.out.println(x);
    }
}
