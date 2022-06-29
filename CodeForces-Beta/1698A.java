import java.util.*;
public class Solution {
    static Scanner sc = new Scanner(System.in);
    
    public static void solver() {
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i =0; i <n ; i++){
            a[i] = sc.nextInt();
        }
        System.out.println(a[0]);
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solver();
        }
    }
}
