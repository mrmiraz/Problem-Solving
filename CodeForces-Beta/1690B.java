import java.util.*;

public class Solution {
    static Scanner sc = new Scanner(System.in);
    
    public static void solver() {
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i =0; i <n ; i++){
            a[i] =sc.nextInt();
        }
        int dif = 0;
        for(int i =0; i <n; i++){
            b[i] = sc.nextInt();
            dif = Math.max(dif, a[i]-b[i]);
        }
        
        for(int i =0;i <n; i++){
            if(a[i]-b[i] != dif && b[i] != 0){
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
