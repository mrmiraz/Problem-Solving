import java.util.*;
public class Solution {
    static Scanner sc = new Scanner(System.in);
    
    public static void solver() {
        int n = sc.nextInt();
        int[] a= new int[n];
        int[] b = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        
        for(int i =0; i < n; i++){
            b[i] = sc.nextInt();
        }
        
        for(int i =0; i < n; i++){
            if(a[i] > b[i]){
                int temp = a[i];
                a[i]  = b[i];
                b[i] = temp;
            }
        }
        
        long sum = 0;
        for(int i = 0; i < n-1; i++){
            sum += Math.abs(a[i]- a[i+1]);
            sum += Math.abs(b[i] - b[i+1]);
        }
        System.out.println(sum);
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solver();
        }
    }
}
