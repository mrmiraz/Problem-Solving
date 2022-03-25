

import java.util.*;

public class Solution {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        if(n < 3){
            System.out.println("No");return;
        }
        int a[] = new int[5001];
        
        for(int i = 1; i <= n; i++){
            a[i] = sc.nextInt();
        }
        
        for(int i = 1; i <= n; i++){
            if(a[i] == a[a[a[a[i]]]]){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
