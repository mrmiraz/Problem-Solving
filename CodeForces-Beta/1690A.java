import java.util.*;

public class Solution {
    static Scanner sc = new Scanner(System.in);
    
    public static void solver() {
        int n = sc.nextInt();
        int r = n%3;
        int a = n/3, b = n/3, c = n/3-1;
        if(r!= 2){
            b = b+r+1;
        }
        else{
            a = a+1;
            b = b+2;
        }
        System.out.println(a + " "+ b + " "+c);
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solver();
        }
    }
}
