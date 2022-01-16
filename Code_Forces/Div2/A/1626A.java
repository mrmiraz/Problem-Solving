import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            String s = sc.next();
            char[] c = s.toCharArray();
            Arrays.sort(c);
            for(int j = 0; j < s.length(); j++){
                System.out.print(c[j]);
            }
            System.out.println();
        } 
    }
}
