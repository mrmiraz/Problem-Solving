import java.util.*;
public class Solution {
    static Scanner sc = new Scanner(System.in);
    
    public static void solver() {
        String d = sc.next();
        int firstSum = 0, lastSum =0;
        for(int i = 0;i < 3; i++){
            firstSum += d.charAt(i)-'0';
        }
        for(int i = 3;i < 6; i++){
            lastSum += d.charAt(i)-'0';
        }
        if(firstSum == lastSum){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solver();
        }
    }
}
