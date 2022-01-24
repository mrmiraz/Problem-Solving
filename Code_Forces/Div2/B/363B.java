import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        Integer[] a = new Integer[n+1], dp = new Integer[n+1];
        dp[0] = 0;
        for(int i = 1; i <= n; i++){
            a[i] = sc.nextInt();
            dp[i] = dp[i-1] + a[i];
        }
        int min = Integer.MAX_VALUE, ans = 1;
        for(int i = 1; i <= n-k+1; i++){
            int windowSum = dp[i+k-1] - dp[i-1];
            if(windowSum < min){
                min = windowSum;
                ans = i;
            }
        }
        System.out.println(ans);
    }
}
