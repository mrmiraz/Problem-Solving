import java.util.*;
public class Solution {
    static Scanner sc = new Scanner(System.in);
    
    public static void solver() {
        int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
        String s1 = sc.next(), s2 = sc.next();
        char[] ca1 = s1.toCharArray();
        char[] ca2 = s2.toCharArray();
        Arrays.sort(ca1);
        Arrays.sort(ca2);
        int n1 = 0, m1 = 0, x = 0,  y = 0;
        String result  = "";
        while(n1 < n && m1 < m){
            if((ca1[n1] < ca2[m1] && x < k) || y == k){
                result += ca1[n1];
                n1++;
                x++;
                y = 0;
            }
            else{
                result += ca2[m1];
                m1++;
                y++;
                x = 0;
            }
        }
        System.out.println(result);
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solver();
        }
    }
}
