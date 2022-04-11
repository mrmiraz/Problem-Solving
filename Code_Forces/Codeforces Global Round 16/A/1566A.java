import java.util.*;
public class Solution {
    static Scanner sc = new Scanner(System.in);
    
    public static void solver() {
        int n = sc.nextInt(), s = sc.nextInt();
        int r = n/2 + 1;
        System.out.println(s/r);
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solver();
        }
    }
}
