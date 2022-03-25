import java.util.*;
 
public class Solution {
    
    Scanner sc = new Scanner(System.in);
    
    public void solver() {
         int a = sc.nextInt(), b = sc.nextInt();
         int xor;
         int c = a-1;
         if((c)%4 == 0)xor = c;
         else if((c)%4 == 1)xor = 1;
         else if((c)%4 == 2)xor = c+1;
         else xor = 0;
         int ans;
         
         if(xor == b){
             ans = a;
         }
         else{
             if((xor ^ b) != a)ans = a+1;
             else ans = a+2;
         }
         System.out.println(ans);
    }
    
    public static void main(String[] args) {
        Solution s = new Solution();
        int t = s.sc.nextInt();
        while(t-- > 0){
            s.solver();
        }
    }
}
