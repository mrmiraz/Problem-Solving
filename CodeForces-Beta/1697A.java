import java.util.*;
public class Solution {

    static Scanner sc = new Scanner(System.in);
    
    public static void solver() {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum  = 0;
        for(int i =0; i < n; i++){
            sum += sc.nextInt();
        }
        System.out.println(Math.max(0, sum-m));
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solver();
        }
    }
}
