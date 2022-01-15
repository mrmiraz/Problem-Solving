import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), flag = 0;
        for(int i = 1; i <= n; i++){
            
            for(int j = 1; j <=m; j++){
                if(i % 2 == 0){
                    if(j == 1 && flag%2 == 1){
                        System.out.print("#");
                    }
                    else if(j == m && flag%2 == 0){
                        System.out.print("#");
                    }
                    else
                        System.out.print(".");
                }
                else
                    System.out.print("#");
            }
            if(i % 2 == 0)
               flag++;
            System.out.println();
        }
    }
}
