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
        int n = sc.nextInt();
        String s = sc.next();
        int index = 0;
        for(int i = 0; i < n; i++){
            index = index + i;
            if(index < n){
                print(s.charAt(index));
            }
        }
        println("");
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.solver();
    }
}
