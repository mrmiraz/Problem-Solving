import java.util.HashSet;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[] colorCharArray = {'C', 'M', 'Y'};
        HashSet<Character> set = new HashSet<>();
        for (char i : colorCharArray) {
            set.add(i);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                char color = sc.next().charAt(0);
                if (set.contains(color)) {
                    System.out.println("#Color");
                    return;
                }
            }
        }
        System.out.println("#Black&White");
    }
}
