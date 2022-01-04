import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        String s = sc.next(), r = sc.next();
        int i = 0;
        while (i < s.length() && s.charAt(i) != '|') {
            s1.append(s.charAt(i));
            i++;
        }
        i++;
        while (i < s.length()) {
            s2.append(s.charAt(i));
            i++;
        }
        i = 0;
        while (i < r.length()) {
            if (s1.length() > s2.length()) {
                s2.append(r.charAt(i));
            } else {
                s1.append(r.charAt(i));
            }
            i++;
        }
        if (s1.length() == s2.length()) {
            System.out.println(s1.toString() + "|" + s2.toString());
        } else {
            System.out.println("Impossible");
        }
    }
}
