import java.util.*;
public class Solution {
    static Scanner sc = new Scanner(System.in);
    
    public static int getDifference(String s1, String s2, int l){
        int d = 0;
        for(int i = 0; i < l; i++){
            d += Math.abs(s1.charAt(i)-s2.charAt(i));
        }
        
        return d;
    }
    public static void solver() {
        int n = sc.nextInt(), m = sc.nextInt();
        String[] s = new String[n];
        
        for(int i =0; i < n; i++){
            s[i] = sc.next();
        }
        int minAns = Integer.MAX_VALUE;
        for(int i = 0;i < n; i++){
            for(int j = i+1; j < n; j++){
                
                minAns = Math.min(minAns, getDifference(s[i], s[j], m));
            }
        }
        
        System.out.println(minAns);
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solver();
        }
    }
}
