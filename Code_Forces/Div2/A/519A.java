import java.util.*;
 
public class Solution {
    
    Scanner sc = new Scanner(System.in);
    
    public void solver() {
      int n = sc.nextInt();
      long sum1 = 0, sum2 = 0, sum3 = 0;
      for(int i = 0; i < n; i++){
          sum1 += sc.nextInt();
      }
      
      
      for(int i = 0; i < n-1; i++){
          sum2 += sc.nextInt();
      }
      for(int i =0; i < n-2; i++){
          sum3 += sc.nextInt();
      }
        System.out.println((sum1-sum2) +"\n" + (sum2 -sum3));
    }
    
    public static void main(String[] args) {
        Solution s = new Solution();
        s.solver();
    }
}
