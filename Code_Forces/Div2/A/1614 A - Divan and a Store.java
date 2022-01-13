import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), l = sc.nextInt(), r = sc.nextInt(), k = sc.nextInt();
            int c = 0;
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            for (int j = 0; j < n; j++) {
                int p = arr[j];
                if (p >= l && p <= r) {
                    if (k >= p) {
                        c++;
                        k = k - p;
                    } else {
                        break;
                    }

                }
            }
            System.out.println(c);
        }
    }
}
