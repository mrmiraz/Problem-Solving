import java.util.*;

public class Solution {
   
    public void print(Object o){
        System.out.print(""+o);
    }
    public void println(Object o){
        System.out.println(""+o);
    }
    public void solver(){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t--> 0){
            int n = in.nextInt(), odd = 0, even = 0;
            for(int i = 0; i < n; i++){
                if(in.nextInt()%2 == 0)even++;
                else odd++;
            }
            if(odd%2 != 0){
                println("YES");
            }
            else if(even != n && odd != n){
                println("YES");
            }
            else println("NO");
        }
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        sol.solver();
   }
}
