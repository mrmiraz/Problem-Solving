import java.util.*;

public class Solution {
    Scanner sc = new Scanner(System.in);
    public void solver() {
        int n = sc.nextInt();
        String s = sc.next();
        if((s.substring(0, 4)).equals("2020") 
                || (s.substring(0, 3)+s.substring(n-1, n)).equals("2020")
                ||(s.substring(0, 2) + s.substring(n-2, n)).equals("2020")||
                (s.substring(0, 1) + s.substring(n-3, n)).equals("2020")||
                s.substring(n-4, n).equals("2020")
                )
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int t = sol.sc.nextInt();
        while(t-->0){
            sol.solver();
        }
            
    }
}
