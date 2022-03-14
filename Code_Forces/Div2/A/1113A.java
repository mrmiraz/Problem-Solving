import java.util.*;

public class Solution {
    Scanner sc = new Scanner(System.in);

    public void solver() {
        int n = sc.nextInt(), v = sc.nextInt();
        if(n <= v){
            System.out.println(n-1);
            return;
        }
        int price = v, i = 2;
        n = n - v;
        while(n-1 > 0){
            price += i;
            n--;i++;
        }
        System.out.println(price);
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.solver();
    }
}
