import java.util.*;

public class Solution {

    static Scanner sc = new Scanner(System.in);
    
    public static void solver() {
        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();
        long ans = n;
        for(int i = 1; i < n; i++){
            if(s[i] != s[i-1])ans += i;
        }
        System.out.println(ans);
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solver();
        }
    }
}
