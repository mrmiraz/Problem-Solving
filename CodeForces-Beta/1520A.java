import java.util.*;
public class Solution {
    static Scanner sc = new Scanner(System.in);
    
    public static void solver() {
        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();
        HashSet<Character> set = new HashSet<>();
        set.add(s[0]);
        for(int i = 1; i < n; i++){
            if(s[i] != s[i-1]){
                if(set.contains(s[i])){
                    System.out.println("NO");
                    return;
                }
                set.add(s[i]);
            }
        }
        System.out.println("YES");
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solver();
        }
    }
}
