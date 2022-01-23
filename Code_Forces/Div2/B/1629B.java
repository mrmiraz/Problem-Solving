import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int l = sc.nextInt(), r = sc.nextInt(), k = sc.nextInt();
            int s = (r+1)/2-l/2;
            if(s <= k || (l == r && l != 1))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
