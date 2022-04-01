import java.util.*;

public class Solution {
    static Scanner sc = new Scanner(System.in);
    
    public static void solver() {
        int a = sc.nextInt(), b = sc.nextInt();
        if(a == 0){
            System.out.println("1");
        }
        else{
            System.out.println((a+2*b+1));
        }
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solver();
        }
    }
}
