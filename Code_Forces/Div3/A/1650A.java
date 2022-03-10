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
            String a = in.next();
            String b = in.next();
            boolean flag = false;
            for(int i = 0; i < a.length();i++){
                
                if(a.charAt(i) == b.charAt(0) && (i+1) % 2 == 1){
                    flag = true;
                }
            }
            if(flag){
                println("YES");
            }
            else
                println("NO");
        }
    }
    
    public static void main(String[] args){
        Solution sol = new Solution();
        sol.solver();
   }
}
