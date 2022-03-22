import java.util.*;
public class Solution {
    static Scanner sc = new Scanner(System.in);
    
    public static void solver() {
        String s = sc.next();
        
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i =0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
               map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i), 1);
            }
        }

        int i = 0;
        for(; i < s.length(); i++){
            if(map.get(s.charAt(i)) == 1){
                String out = s.substring(i, s.length());
                System.out.println(out);
                return;
            }
            else{
                map.put(s.charAt(i), map.get(s.charAt(i))-1);
            }
            
        }
        
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solver();
        }
    }
}
