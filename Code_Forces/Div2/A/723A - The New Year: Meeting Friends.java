import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
        int max = Math.max(x, Math.max(y, z));
        int min = Math.min(x, Math.min(y, z));
        System.out.println(max-min);
    }
}
