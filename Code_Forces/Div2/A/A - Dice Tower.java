import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), z = sc.nextInt();
        
        for(int i = 0;i < n; i++){
            int x = sc.nextInt(), y = sc.nextInt();
            if(x == z || y == z || x == 7 -z || y == 7 - z){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
