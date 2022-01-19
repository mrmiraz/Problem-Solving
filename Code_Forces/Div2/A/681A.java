import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            String name = sc.next();
            int before = sc.nextInt(), after = sc.nextInt();
            if(before >= 2400 && after > before){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
