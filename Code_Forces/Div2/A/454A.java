import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i <= n/2; i++){
            for(int space = 0; space < n/2 - i; space++){
                System.out.print("*");
            }
            for(int star = 0; star < 2*i+1; star++){
                System.out.print("D");
            }
            for(int space = n/2 - i; space > 0 ; space--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(int i = n/2-1; i >= 0; i--){
            for(int space = 0; space < n/2 - i; space++){
                System.out.print("*");
            }
            for(int star = 0; star < 2*i+1; star++){
                System.out.print("D");
            }
            for(int space = n/2 - i; space > 0 ; space--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
