import java.util.*;
public class Solution {

    static Scanner sc = new Scanner(System.in);
    
    public static void solver() {
        int n = sc.nextInt(), z = sc.nextInt(), max = 0;
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            max = Math.max(max, a|z);
        }
        System.out.println(max);
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solver();
        }
    }
}
