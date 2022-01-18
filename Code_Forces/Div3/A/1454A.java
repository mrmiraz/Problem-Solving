import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            for(int j = n; j >= 1; j--){
                if(n%2 != 0 && j == (n/2)+1){
                    System.out.print(j-1 + " " + j + " "); j-= 1;
                }else
                    System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
