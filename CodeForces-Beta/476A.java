import java.util.*;

public class Solution {

    static Scanner sc = new Scanner(System.in);

    public static void solve(){
        int n = sc.nextInt(), m  = sc.nextInt();
        if(n < m){
            System.out.println("-1");
        }
        else{
            int minStep = (n+1)/2;
            if(minStep% m == 0){
                System.out.println(minStep);
            }
            else
                System.out.println((minStep+m)-(minStep+m)%m);
        }
        
    }
    public static void main(String[] args) {
        solve();
    }
}
