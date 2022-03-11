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
            String s = sc.next();
            int a = 0, b = 0, c = 0;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == 'A')a++;
                else if(s.charAt(i) == 'B')b++;
                else c++;
            }
            if(a+c == b){
                println("YES");
            }
            else{
                println("NO");
            }
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.solver();
    }
}
