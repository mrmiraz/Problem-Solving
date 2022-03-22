import java.util.*;
public class Solution {
    static Scanner sc = new Scanner(System.in);
    
    public static void solver(){
        String keys = sc.next();
        String s = sc.next();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 1; i <= 26; i++){
            map.put(keys.charAt(i-1), i);
        }
        int sum = 0;
        int l = s.length();
        for(int i = 1; i < l; i++){
            sum += Math.abs(map.get(s.charAt(i)) - map.get(s.charAt(i-1)));
        }
        System.out.println(sum);
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solver();
        }
    }
}
