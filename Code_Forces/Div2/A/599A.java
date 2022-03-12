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
        Long d1 = sc.nextLong(), d2 = sc.nextLong(), d3 =  sc.nextLong();
        long min = Long.MAX_VALUE;
        min = Math.min((d1+d2+d3),min);
        min = Math.min((2*(d1+d2)), min);
        min = Math.min((2*(d1+d3)), min);
        min = Math.min((2*(d2+d3)), min);
        println(min);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.solver();
    }
}
