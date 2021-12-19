import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int people = sc.nextInt();
            int capacity = sc.nextInt();
            if (people + 2 <= capacity) count++;
        }
        System.out.println(count);
    }
}
