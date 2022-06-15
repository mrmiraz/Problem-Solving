import java.util.*;
public class Solution {
    static Scanner sc = new Scanner(System.in);
    public static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    public static void solver() {
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i =0; i < n; i++){
            a[i] = sc.nextInt();
            b[i] = a[i];
        }
        if(n == 1){
            System.out.println("-1");
            return;
        }
        Arrays.sort(b);
        
        for(int i = 0;i < n-1; i++){
            if(a[i] == b[i]){
                swap(b, i, i+1);
            }
        }
        
        if(b[n-1] == a[n-1])swap(b, n-1, n-2);
        
        for(int i =0; i < n; i++){
            System.out.print(b[i] + " ");
        }
        System.out.println("");
        
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solver();
        }
    }
}
