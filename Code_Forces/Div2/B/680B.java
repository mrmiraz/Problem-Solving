import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a = sc.nextInt();
        int[] c = new int[n+1];
        for(int i = 1; i <= n; i++){
            c[i] = sc.nextInt();
        }
        int count = 0;
        if(c[a] == 1)count =1;
        int left = a-1, right = a+1;
        while(left > 0 && right <= n){
            if(c[left]== 1 && c[right] == 1){
                count += 2;
            }
            left--;right++;
        }
        while(left > 0){
            if(c[left] == 1)count++;
            left--;
        }
        while(right <= n){
            if(c[right] == 1)count++;
            right++;
        }
        System.out.println(count);
    }
}
