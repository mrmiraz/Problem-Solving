import java.util.*;

public class Solution {

    public void print(Object o) {
        System.out.print("" + o);
    }

    public void println(Object o) {
        System.out.println("" + o);
    }

    public void solver() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x =sc.nextInt();
            println("1 "+(x-1));
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.solver();
    }
}
