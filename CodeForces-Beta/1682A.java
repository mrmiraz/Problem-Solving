import java.util.*;

public class Solution {
    static Scanner sc = new Scanner(System.in);
    
    public static void solver() {
        int n = sc.nextInt();
        char[] ch = sc.next().toCharArray();
        int cnt = 0;
        for(int i =(n-1)/2; i >= 0; i--){
            if(ch[i] == ch[(n-1)/2])cnt++;
            else break;
        }
        System.out.println((2*cnt)-(n&1));
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solver();
        }
    }
}
