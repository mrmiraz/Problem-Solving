import java.util.*;

public class Solution {
    Scanner sc = new Scanner(System.in);
    public void solver() {
        int n = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        int[] x = new int[n];
        for(int i = 0; i < n; i++){
            x[i] = sc.nextInt();
        }
        for(int i = n-1; i >= 0; i--){
            if(!set.contains(x[i]+1)){
                set.add(x[i]+1);
            }
            else{
                set.add(x[i]);
            }
        }
        System.out.println(set.size());
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int t = sol.sc.nextInt();
        while(t-->0){
            sol.solver();
        }
            
    }
}
