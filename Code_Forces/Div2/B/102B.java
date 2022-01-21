import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        while (s.length() > 1) {
            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                sum += s.charAt(i)-'0';
            }
            count++;
            s = ""+sum;
        }
        System.out.println(count);
    }
}
