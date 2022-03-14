import java.util.*;

public class Solution {
    Scanner sc = new Scanner(System.in);
    
    public void solver() {
         int n = sc.nextInt();
         int[] a = new int[n];
         for(int i = 0; i <n ; i++){
             a[i] = sc.nextInt();
         }
         for(int j = 0; j < n; j++){
             boolean left_flag = false, right_flag = false;
             int k = j+1, i = j-1;
             for(; k < n; k++){
                 if(a[k] < a[j]){
                     right_flag = true;break;
                 }
             }
             for(; i >= 0; i--){
                 if(a[i] < a[j]){
                     left_flag = true;break;
                 }
             }
             if(right_flag  && left_flag){
                 System.out.println("YES");
                 System.out.println((i+1) + " " + (j+1) + " " + (k+1));
                 return;
             }
             
         }
         System.out.println("NO");
    }
    
    public static void main(String[] args) {
        Solution s = new Solution();
        int t = s.sc.nextInt();
        while (t-- > 0) {
            s.solver();
        }
    }
}
