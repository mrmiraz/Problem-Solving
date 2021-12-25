import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long m = sc.nextInt();
        long a = sc.nextInt();
        System.out.println((long)Math.ceil((double)n/a) * (long)Math.ceil((double)m/a));
    }
}
