import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int n = sc.nextInt(), k = sc.nextInt();
            Integer[][] a = new Integer[n][2];
            for(int j = 0; j < n; j++){
                a[j][0]  = sc.nextInt();
            }
            
            for(int j = 0; j < n; j++){
                a[j][1] = sc.nextInt();
            }
            
            Arrays.sort(a, (x, y)-> Integer.compare(x[0], y[0]));
            
            for(int j = 0; j < n; j++){
                if(k >= a[j][0]){
                    k+= a[j][1];
                }
                else break;
            }
            System.out.println(k);
        }
    }
}
