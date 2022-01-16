import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 0; j < t; j++) {
            int n = sc.nextInt();
            if (n % 4 == 0) {
                System.out.println("YES");
                int oddSum = 0, evSum = 0, number = 2;
                for (int i = 0; i < n / 2; i++) {
                    evSum += number;
                    System.out.print(number + " ");
                    number += 2;
                }
                number = 1;
                for (int i = 1; i < n / 2; i++) {
                    oddSum += number;
                    System.out.print(number + " ");
                    number += 2;
                }
                System.out.println(evSum - oddSum);
            } else {
                System.out.println("NO");
            }
        }
    }
}
