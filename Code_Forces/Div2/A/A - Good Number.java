import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        String numberString = "0123456789";

        int finalCount = 0;
        for (int i = 0; i < n; i++) {
            String number = sc.next();
            int count = 0;
            for (int j = 0; j <= k; j++) {
                if (number.contains("" + numberString.charAt(j))) {
                    count++;
                }
            }
            if (count == k + 1) {
                finalCount++;
            }
        }
        System.out.println(finalCount);
    }
}
