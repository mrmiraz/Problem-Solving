import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int a = sc.nextInt(), b = sc.nextInt();
            int min = Math.min(a, b);
            int max = Math.max(a, b);
            System.out.println((int)Math.pow(Math.max(2*min, max), 2));
        }
    }
}
