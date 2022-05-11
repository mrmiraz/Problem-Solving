import java.util.*;
public class Solution {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = sc.nextInt(), k = sc.nextInt(), 
                l = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt(),
                p = sc.nextInt(), nl = sc.nextInt(), 
                np = sc.nextInt();
        int totalDrinks = k*l;
        int totalSlice = c*d;
        int min = Math.min(totalDrinks/nl, Math.min(totalSlice, p/np));
        System.out.println(min/n);
    }
}
