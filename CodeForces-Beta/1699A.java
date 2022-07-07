import java.util.*;

public class Solution {

    static Scanner sc = new Scanner(System.in);
    
    public static void solver() {
        int n = sc.nextInt();
        if((n&1) == 0){
            System.out.println(n/2 + " "+ n/2 + " 0");
        }
        else{
            System.out.println("-1");
        }
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solver();
        }
    }
}
