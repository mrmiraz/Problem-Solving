import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt(), r = sc.nextInt(), a = sc.nextInt();
        
        int d = Math.abs(l-r), sum = 0;
        if(d >= a){
            System.out.println( 2*(Math.min(l, r)+a));
            return;
        }
        else{
            a = a-d;
             sum += 2*(Math.min(l, r)+d);
             sum += a%2 == 0? a: (a-1);
             System.out.println(sum);
        }
    }
}
