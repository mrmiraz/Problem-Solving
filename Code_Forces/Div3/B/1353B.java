import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int n = sc.nextInt(), k = sc.nextInt();
            Integer[] a = new Integer[n];
            Integer[] b = new Integer[n];
            
            for(int j = 0; j < n; j++){
                a[j] = sc.nextInt();
            }
            for(int j = 0; j < n; j++){
                b[j] = sc.nextInt();
            }
            Arrays.sort(a);
            Arrays.sort(b,(x, y)-> x<y? 1:-1);
            int j = 0, sum = 0;
            while(k > 0){
                if(a[j] >= b[j])break;
                else sum+=b[j];
                j++; k--;
            }
            while(j < n)sum += a[j++];
            System.out.println(sum);
        }
    }
}
