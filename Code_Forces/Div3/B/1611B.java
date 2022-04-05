import java.util.*;
public class Solution {
    static Scanner sc = new Scanner(System.in);
    
    public static void solver() {
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println(Math.min(Math.min(a, b), (a+b)/4));
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solver();
        }
    }
}
