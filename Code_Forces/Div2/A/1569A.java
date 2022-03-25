import java.util.*;
 
public class Solution {
    
    Scanner sc = new Scanner(System.in);
    
    public void solver() {
         int n = sc.nextInt();
         int a = sc.nextInt();
         int min = a;
         for(int i =1; i < n;i++){
             min = min & sc.nextInt();
         }
         System.out.println(min);
    }
    
    public static void main(String[] args) {
        Solution s = new Solution();
        int t = s.sc.nextInt();
        while (t-- > 0) {
            s.solver();
        }
    }
}
