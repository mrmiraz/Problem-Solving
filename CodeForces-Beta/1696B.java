import java.util.*;
public class Solution {

    static Scanner sc = new Scanner(System.in);
    
    public static void solver() {
        int n = sc.nextInt(), ans  = 0;
        int prev  = 0;
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            if(a != 0 && prev == 0) ans++;
            prev = a;
        }
        System.out.println(Math.min(ans, 2));

    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solver();
        }
    }
}
