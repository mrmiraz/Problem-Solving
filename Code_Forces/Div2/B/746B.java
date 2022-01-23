import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        StringBuilder sb = new StringBuilder();
        int i = 1;
        while(n != 0){
            if(n % 2 == 0)
                sb.insert(0, s.charAt(i-1));
            else
                sb.append(s.charAt(i-1));
            n = n - 1;i++;
        }
        System.out.println(sb.toString());
    }
}
