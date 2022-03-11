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
            HashMap<Character, Integer> map = new HashMap<>();
            for(int i = 0; i < n; i++){
                String s = in.next();
                for(int j = 0; j < s.length(); j++){
                    if(map.containsKey(s.charAt(j))){
                        map.put(s.charAt(j), map.get(s.charAt(j)) + 1);
                    }
                    else{
                        map.put(s.charAt(j), 1);
                    }
                }
            }
            int flag = 0;
            for(char key: map.keySet()){
                if(map.get(key)%n != 0){
                    flag = 1; break;
                }
            }
            if(flag == 0)println("YES");
            else println("NO");
        }
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        sol.solver();
   }
}
