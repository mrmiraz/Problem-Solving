import java.util.*;

public class Solution {
    static Scanner sc = new Scanner(System.in);
    
    public static void solver() {
        String s = sc.next();
        HashMap<Character, Integer> map = new HashMap<>();
        int size = s.length() , len = s.length();
        for(int i =0; i < size; i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
            if(map.get(s.charAt(i)) == 2){
                len = len-2;
                map.clear();
            }
        }
        System.out.println(len);
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solver();
        }
    }
}
