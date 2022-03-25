import java.util.*;
 
public class Solution {
    
    Scanner sc = new Scanner(System.in);
    
    public void solver() {
         int n = sc.nextInt();
         int p = 1;
         while(p <= n){
            p = p << 1;
         }
         System.out.println((p>>1) -1);
    }
    
    public static void main(String[] args) {
        Solution s = new Solution();
        int t = s.sc.nextInt();
        while (t-- > 0) {
            s.solver();
        }
    }
}
