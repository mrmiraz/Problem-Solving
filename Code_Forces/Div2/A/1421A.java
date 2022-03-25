import java.util.*;
 
public class Solution {
    
    Scanner sc = new Scanner(System.in);
    
    public void solver() {
         int a = sc.nextInt(), b = sc.nextInt();
         int min = Math.min(a,b);
         System.out.println((a^min) + (b^min));
    }
    
    public static void main(String[] args) {
        Solution s = new Solution();
        int t = s.sc.nextInt();
        while (t-- > 0) {
            s.solver();
        }
    }
}
