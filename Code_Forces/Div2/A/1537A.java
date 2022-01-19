import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            int sum = -n;
            for(int j = 0; j < n; j++){
                sum+= sc.nextInt();
            }
            if(sum < 0) sum = 1;
            else if(sum == 0) sum = 0;
            System.out.println(sum);
        }
    }
}
