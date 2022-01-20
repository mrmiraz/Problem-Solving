import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        for(int i = 1; i <= n; i++){
            a[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for(int i = 1; i <=n; i++){
            int left = i-1, right = i+1;
            while(left > 0){
                if(a[left] > a[left+1])break;
                left--;
            }
            while(right <= n){
                if(a[right] > a[right-1])break;
                right++;
            }
            max = Math.max(max, right-left-1);
        }
        System.out.println(max);
    }
}
