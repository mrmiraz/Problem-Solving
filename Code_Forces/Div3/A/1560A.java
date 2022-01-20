import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int k = sc.nextInt(), j = 1;
            while(k > 0){
                if(j % 3 != 0 && j%10 != 3)k--;
                j++;
            }
            System.out.println(j-1);
        }
    }
}
