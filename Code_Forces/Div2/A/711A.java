import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt(), flag = 1;
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            String b = sc.next();
            if (flag == 1 && b.charAt(0) == 'O' && b.charAt(1) == 'O') {
                sb.append("++|").append(b.charAt(3)).append(b.charAt(4)).append("\n");
                flag = 0;
            } else if (flag == 1 && b.charAt(3) == 'O' && b.charAt(4) == 'O') {
                sb.append(b.charAt(0)).append(b.charAt(1)).append("|++\n");
                flag = 0;
            } else {
                sb.append(b).append("\n");
            }
        }
        if (flag == 1) 
            System.out.println("NO");
        else
            System.out.println("YES\n" + sb.toString());
    }
}
