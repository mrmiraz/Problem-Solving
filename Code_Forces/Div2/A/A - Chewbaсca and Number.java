import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        char[] c = x.toCharArray();
        for(int i = 0; i < c.length; i++){
            int t = c[i];
            if(t >= ('0'+5))
                c[i] = (char)('9'-c[i] + '0');
            if(c[0] == '0')
                c[0] = (char)t;
        }
        System.out.println(c);
    }
}
