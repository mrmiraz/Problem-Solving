import java.util.*;

public class Solution {
    Scanner sc = new Scanner(System.in);
    public void solver() {
        int k2 = sc.nextInt(), k3 = sc.nextInt(), k5 = sc.nextInt(), k6 = sc.nextInt();
        int sum  = 0; 
        int min = Math.min(k2, Math.min(k5, k6));
        sum += 256*min;
        sum += 32*Math.min(k2-min, k3);
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.solver();   
    }
}
