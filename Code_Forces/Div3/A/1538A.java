import java.util.*;

public class Solution {
    Scanner sc = new Scanner(System.in);
    public void solver() {
        int n = sc.nextInt();
        int dp[] = new int[n+1];
        int a[] = new int[n];
        for(int i = 1; i <= n; i++){
            a[i-1] = sc.nextInt();
            dp[a[i-1]] = i;
        }
        Arrays.sort(a);
        int min_index = dp[a[0]], max_index = dp[a[n-1]];
        int a1 = Math.max(min_index, max_index);
        int a2 = n- Math.min(min_index, max_index)+1;
        int a3 = Math.min(min_index, max_index) + n-Math.max(min_index, max_index)+1;
        System.out.println(Math.min(a1, Math.min(a2, a3)));
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int t = sol.sc.nextInt();
        while(t--> 0){
            sol.solver();
        }
    }
}
