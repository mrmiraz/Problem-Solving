import java.util.*;
public class Solution {
    static Scanner sc = new Scanner(System.in);
    
    public static void solver() {
        int n = sc.nextInt(), k = sc.nextInt();
        int[] a = new int[n];
        for(int i =0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int ans = 0;
        for(int i =1; i < n-1; i++){
            if(a[i] > a[i-1]+a[i+1])ans++;
        }
        if(k == 1){
            System.out.println((n-1)/2);
        }
        else{
            System.out.println(ans);
        }
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solver();
        }
    }
}
