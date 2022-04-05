import java.util.*;
public class Solution {
    static Scanner sc = new Scanner(System.in);
    
    public static void solver() {
        int l = sc.nextInt(), r = sc.nextInt();
        if(r >= 2*l){
            System.out.println(l + " "+ 2*l);
        }
        else
            System.out.println("-1"+ " -1");
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solver();
        }
    }
}
