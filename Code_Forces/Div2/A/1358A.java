import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int n = sc.nextInt(), m = sc.nextInt();
            System.out.println((int)Math.ceil((m*n)/2.0));
        }
    }
}
