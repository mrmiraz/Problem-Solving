import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int j = 0; j < n; j++){
                a[j] = sc.nextInt();
            }
            Arrays.sort(a);
            int flag = 0;
            for(int j = 0; j < n-1; j++){
                int d = Math.abs(a[j] - a[j+1]);
                if(d  > 1){
                    flag = 1;
                    System.out.println("NO");
                    break;
                }
            }
            if(flag == 0)
                System.out.println("YES");
        }
    }
}
