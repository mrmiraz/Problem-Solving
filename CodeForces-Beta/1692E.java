import java.util.*;

public class Solution {

    static Scanner sc = new Scanner(System.in);

    
    public static void solver1(){
        int n = sc.nextInt(), s = sc.nextInt();
        int cutSum = 0, ans = n+1;
        int[] a = new int[n];
        for(int i =0, j = 0; j < n; j++){
            a[j] = sc.nextInt();
            cutSum += a[j];
            while(cutSum > s){
                cutSum -= a[i++];
            }
            if(cutSum == s){
                ans = Math.min(ans, n-j+i-1);
            }
        }
        if(ans == n+1){
            System.out.println("-1");
        }
        else{
            System.out.println(ans);
        }
    }
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solver1();
        }
    }
}
