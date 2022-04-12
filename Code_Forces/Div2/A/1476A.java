import java.util.*;
public class Solution {
    static Scanner sc = new Scanner(System.in);
    
    public static void solver() {
        long n = sc.nextInt(), k = sc.nextInt();
        
        long cf = (n+k-1)/k;
        k *= cf;
        System.out.println((k+n-1)/n);
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solver();
        }
    }
}
