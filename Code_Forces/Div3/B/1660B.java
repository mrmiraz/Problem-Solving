import java.util.*;

public class Solution {
    static Scanner sc = new Scanner(System.in);
    
    public static void solver() {
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i =0; i < n; i++){
            a[i] = sc.nextInt();
        }
        
        Arrays.sort(a);
        if(n==1){
            if(a[n-1] == 1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        else{
            if((a[n-1]- a[n-2]) <= 1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }  
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solver();
        }
    }
}
