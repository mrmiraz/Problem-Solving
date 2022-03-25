import java.util.*;
public class Solution {
    static Scanner sc = new Scanner(System.in);
    
    public static void solver() {
        int n = sc.nextInt(), B = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
        long sum = 0;
        int[] a = new int[n+1];
        a[0] = 0;
        for(int i = 1; i <= n; i++){
            if((x+a[i-1])> B){
                a[i] = a[i-1]-y;
            }
            else
                a[i] = a[i-1]+x;
            sum += a[i];
        }
        System.out.println(sum);
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solver();
        }
    }
}
