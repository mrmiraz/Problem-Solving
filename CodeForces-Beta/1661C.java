import java.util.*;
public class Solution {
    static Scanner sc = new Scanner(System.in);
    public static long work(int[] h, int n, int max){
        long sum1 = 0, sum2 = 0;
        for(int i =0;i < n; i++){
            sum1 += (max-h[i])>>1;
            sum2 += (max-h[i])&1;
        }
        if(sum1 < sum2)return sum2*2-1;
        return (sum2*2+(sum1-sum2)*2/3*2 + (sum1-sum2)*2%3);
    }
    public static void solver() {
        int n = sc.nextInt();
        int[] h = new int[n];
        int max = Integer.MIN_VALUE;
        for(int i =0; i < n; i++){
            h[i] = sc.nextInt();
            max = Math.max(h[i], max);
        }
        
        System.out.println(Math.min(work(h, n, max), work(h, n, max+1)));
        
        
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solver();
        }
    }
}
