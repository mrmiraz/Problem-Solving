import java.util.*;

public class Solution {
    Scanner sc = new Scanner(System.in);
    public void solver() {
        int n = sc.nextInt();
        int a[] =new int[n];
        int dp[] = new int[n];
        a[0] = sc.nextInt();
        dp[0] = 1;
        for(int i = 1; i < n; i++){
            a[i] = sc.nextInt();
            if(a[i] >= a[i-1]){
                dp[i] = Math.max(dp[i-1], dp[0]+=1);
            }
            else{
                dp[i] = dp[i-1];
                dp[0] = 1;
            }
        }
        System.out.println(dp[n-1]);
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.solver();   
    }
}
