import java.util.*;

public class Solution {

    static Scanner sc = new Scanner(System.in);

    public static void solver() {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);

        for (int i = 0; i < n - 2; i++) {
            if (a[i]+a[i+1] > a[i+2]) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }

    public static void main(String[] args) {
        solver();
    }
}
