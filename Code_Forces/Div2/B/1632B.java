import java.util.*;
 
public class Solution {
    
    Scanner sc = new Scanner(System.in);
    
    public void solver() {
         int n= sc.nextInt();
         int k= 0;
         while((1<<k+1) <= n-1)k++;
         for(int i = (1<<k)-1; i >= 0; i--){
             System.out.print(i +" ");
         }
         for(int i = (1<<k); i <= n-1; i++){
             System.out.print(i + " ");
         }
         System.out.println();
         
    }
    
    public static void main(String[] args) {
        Solution s = new Solution();
        int t = s.sc.nextInt();
        while(t-- > 0){
            s.solver();
        }
    }
}
