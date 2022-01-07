import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int a =sc.nextInt(), b =sc.nextInt(), c = sc.nextInt(), n = sc.nextInt();
            int max = Math.max(a, Math.max(b, c));
            n = n - (max -a);
            n = n - (max -b);
            n = n - (max - c);
            System.out.println(n>=0 && n %3 ==0? "YES":"NO");
        }
    }
}
