import java.util.*;

public class Solution {
    static Scanner sc = new Scanner(System.in);
    
    public static void solver() {
        int n = sc.nextInt();
        int e = 0, o = 0;
        for(int i =0; i < n; i++){
            int a = sc.nextInt();
            if(a%2 != i%2){
                if(i%2 == 0){
                    e++;
                }else
                    o++;
            }
        }
        if(e == o){
            System.out.println(e);
        }
        else{
            System.out.println(-1);
        }
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solver();
        }
    }
}
