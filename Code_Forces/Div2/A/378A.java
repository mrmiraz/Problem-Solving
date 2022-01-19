import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), ac = 0, bc = 0, d = 0;
        for(int i = 1; i <= 6; i++){
            int ad = Math.abs(a-i), bd = Math.abs(b - i);
            if(ad < bd)ac++;
            else if(ad > bd)bc++;
            else d++;
        }
        System.out.println(ac + " "+ d + " "+ bc);
    }
}
