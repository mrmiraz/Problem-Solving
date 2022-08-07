import static java.lang.Math.*;
import java.util.*;
public class Solution {
    static Scanner sc = new Scanner(System.in);
    
    public static void solver() {
        int n = sc.nextInt();
        int maxX = 0, maxY = 0;
        int minX = 0, minY = 0;
        for(int i =0; i < n; i++){
            int x = sc.nextInt(), y = sc.nextInt();
            if(x >= 0){
               maxX = max(x, maxX); 
            }
            if(y >= 0){
                maxY = max(y, maxY);
            }
            if(x < 0){
                minX = min(x, minX);
            }
            if(y < 0){
                minY = min(y, minY);
            }
        }
        int ans = maxX+maxY+abs(minX)+abs(minY);
        System.out.println(ans*2);
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solver();
        }
    }
}
