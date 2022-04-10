import java.util.*;
public class Main {

    static Scanner sc = new Scanner(System.in);
    
    public static int solver() {
        int n = sc.nextInt();
        int dp[][] = new int[n+1][n+1];
        int p1[] = new int[n+1];
        int p2[] = new int[n+1];
        for(int i =1; i <= n; i++){
            p1[i] = sc.nextInt();
        }
        for(int i = 1; i <= n; i++){
            p2[i] = sc.nextInt();
        }
        
//        for(int i =0; i <= n; i++){
//            for(int j =0; j <= n; j++){
//                dp[i][0] = dp[0][i] = 0;
//            }
//        }
        
        Arrays.sort(p1);
        Arrays.sort(p2);
        for(int i = 1; i <= n; i++){
            int point;
            for(int j = 1; j <= n; j++){
                if(p1[i] < p2[j])point = 0;
                else if(p1[i] > p2[j])point = 2;
                else point = 1;
                dp[i][j] = Math.max(dp[i-1][j], Math.max(dp[i][j-1], dp[i-1][j-1]+point));
            }
        }
        return dp[n][n];
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        int i =0;
        while (t-- > 0) {
           int r = solver();
            System.out.println("Case "+(++i)+": "+r);
        }
    }
}
