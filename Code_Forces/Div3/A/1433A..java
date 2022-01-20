import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int x = sc.nextInt();
            int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            int count = 0, flag = 0;
            for(int j = 0; j < x; j++){
                for(int k = 1; k <= 4; k++){
                    count+= k;
                    if(a[j] == x){
                        flag = 1;
                        break;
                    }
                    a[j] = a[j]*10+(j+1);
                }
                if(flag == 1)break;
            }
            System.out.println(count);
        }
    }
}
