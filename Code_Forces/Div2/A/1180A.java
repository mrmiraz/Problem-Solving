import java.util.*;

public class Solution {
    Scanner sc = new Scanner(System.in);
    public void solver() {
        int n = sc.nextInt();
        System.out.println(n*n + (n-1)*(n-1));
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.solver();
            
    }
} 
