import java.util.*;

public class Solution {
    Scanner sc = new Scanner(System.in);
    public void solver() {
        int n = sc.nextInt();
        int a[] = new int[n];
        a[0] = sc.nextInt();
        int max = 1, count = 1;
        for(int i = 1; i < n; i++){
            a[i] = sc.nextInt();
            if(a[i] > a[i-1]){
                count++;
            }
            else{
                max = Math.max(max, count);
                count = 1;
            }
        }
        max = Math.max(max, count);
        System.out.println(max);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
            sol.solver();
    }
}
