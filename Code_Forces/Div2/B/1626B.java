import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            int sum = 0, flag = 0;
            for (int j = s.length() - 2; j >= 0; j--) {
                sum = (s.charAt(j) - '0' + s.charAt(j + 1) - '0');
                if (sum >= 10) {
                    flag = 1;
                    System.out.println(s.substring(0, j) + sum + s.substring(j + 2));
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(sum + s.substring(2));
            }
        }
    }
}
