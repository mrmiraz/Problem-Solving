import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int n = sc.nextInt(), one = 0, two  = 0;
            for(int j = 0; j < n; j++){
                int a = sc.nextInt();
                if(a == 1)one++;
                else two++;
            }
            if((two % 2 == 0 && one % 2 == 0) || (two % 2 != 0 && one != 0 &&(2+one)%2 == 0))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
