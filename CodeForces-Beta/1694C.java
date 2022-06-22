import java.util.*;

public class Solution {

    static Scanner sc = new Scanner(System.in);
    
    public static void solver() {
        int n = sc.nextInt();
        long sum = 0;
        int flag1 = 0, flag2 = 0;
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            sum+= a;
            if(flag1 == 1 && a != 0) flag2 = 1;
            if(sum == 0)flag1 = 1;
            if(sum < 0) flag2 = 1;
            
        }
        if(sum != 0)flag2 = 1;
        if(flag2 == 0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solver();
        }
    }
}
