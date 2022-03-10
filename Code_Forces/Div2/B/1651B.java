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
            int n = in.nextInt();
            if(Math.pow(3, n) <= Integer.MAX_VALUE){
                println("YES");
                for(int i = 0; i < n; i++){
                    print((int)Math.pow(3, i) + " ");
                }
            }
            else{
                print("NO");
            }
            println("");
        }
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        sol.solver();
   }
}
