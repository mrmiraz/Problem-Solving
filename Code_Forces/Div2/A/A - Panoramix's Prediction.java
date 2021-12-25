import java.util.Scanner;

public class Solution {

    public boolean primeNumber(int n) {
        int flag = 0;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag++;
            }
        }
        if (flag == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(!sol.primeNumber(m)){
            System.out.println("NO");
            return;
        }
        int primeNumber = 0;
        for (int i = n + 1; i < m; i++) {
            if (sol.primeNumber(i)) {
                primeNumber++;
            }
        }
        if (primeNumber == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
