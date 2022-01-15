import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        for (int j = 0; j < t; j++) {
            int n = sc.nextInt(),count = 0, flag = 1;
            int[] arr = {1, 2, 3, 4, 5, 6, 7,8, 9};
            while(flag == 1){
                for(int i = 1; i <= 9; i++){
                    if(arr[i-1] <= n){
                        arr[i-1] = arr[i-1]*10 + i;
                        count++;
                    }
                    else{
                        flag = 0;
                        break;
                    }
                        
                }
            }
            System.out.println(count);
        }
    }
}
