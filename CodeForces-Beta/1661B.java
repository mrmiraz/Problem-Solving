import java.util.*;
public class Solution {
    static Scanner sc = new Scanner(System.in);
    
    public static void solver() {
        int n = sc.nextInt();
        int mod = 32768, count = 32767;
        for(int i = 0; i <= 15; i++){
            for(int j = 0; j <= 15; j++){
                if(((n+i)<< j)%mod == 0){
                count = Math.min(count, i+j);
                }
            }
        }
        
        System.out.println(count);
        
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solver();
        }
    }
}
