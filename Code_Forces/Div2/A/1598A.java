import java.util.*;

public class Solution {
    static Scanner sc = new Scanner(System.in);
    
    public static void solver() {
        int n = sc.nextInt();
        char ch1[] = sc.next().toCharArray();
        char ch2[] = sc.next().toCharArray();
        
        for(int i =0; i < n; ++i){
            if(((ch1[i] -'0') & (ch2[i] - '0')) == 1){
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
