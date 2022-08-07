import java.util.*;
public class Solution {
    static Scanner sc = new Scanner(System.in);
    public static void solver() {
        int n = sc.nextInt();
        int[] a = new int[n+1];
        int max = 0;
        int[] prefixMax = new int[n+1];
        int[] sufixMax = new int[n+1];
        
        for(int i = 1; i <= n; i++){
            a[i] = sc.nextInt();
            prefixMax[i] = Math.max(prefixMax[i-1], a[i]);
        }
        
        sufixMax[n] = a[n];
        for(int i = n-1; i >= 0; i--){
            sufixMax[i]= Math.max(sufixMax[i+1], a[i]);
        }
        
        if(n <= 2){
            System.out.println("YES");
            return;
        }
        
        for(int i = 1; i < n; i++){
            if(a[i] < sufixMax[i] && a[i] < prefixMax[i]){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solver();
        }
    }
}
