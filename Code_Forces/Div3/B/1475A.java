import java.util.*;

public class Solution {
    Scanner sc = new Scanner(System.in);

    public void solver() {
        int n = sc.nextInt();
        int y = n%2020;
        int x = (n-y)/2020 - y;
        if(x >= 0 && (2020*x + 2021 * y) == n){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int t = sol.sc.nextInt();
        while(t--> 0){
            sol.solver();
        }
    }
} 
