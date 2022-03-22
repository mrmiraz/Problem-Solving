import java.util.*;
public class Solution {
    static Scanner sc = new Scanner(System.in);
    
    public static void solver() {
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for(int i =0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        long sum = arr[n-1] + arr[n-2];
        System.out.println(sum);
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solver();
        }
    }
}
