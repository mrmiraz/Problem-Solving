import java.util.*;
public class Solution {
    static Scanner sc = new Scanner(System.in);
    
    public static void solver() {
        int n = sc.nextInt();
        int[] candies = new int[n];
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            candies[i] = sc.nextInt();
            min = Math.min(candies[i], min);
        }
        int sum  = 0;
        for(int i =0; i < n; i++){
            sum += candies[i]-min;
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
