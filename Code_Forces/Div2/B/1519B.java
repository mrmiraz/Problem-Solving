import java.util.*;

public class Solution {
    Scanner sc = new Scanner(System.in);
    public void solver() {
        int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
        if(n*m-1 == k){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int t = sol.sc.nextInt();
        while(t-->0){
            sol.solver();
        }
            
    }
}
