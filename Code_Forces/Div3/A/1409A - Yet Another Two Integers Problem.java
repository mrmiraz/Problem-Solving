import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            int difference = Math.abs(a - b);
            int move = difference%10 == 0? difference/10 : difference/10 + 1;
            System.out.println(move);
        }
    }
}
