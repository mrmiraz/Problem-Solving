import java.util.*;
public class Solution {
    static Scanner sc = new Scanner(System.in);
    
    public static void solver() {
        int n = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for(int i =0; i < n; i++){
            set.add(sc.nextInt());
        }
        if((n&1) == (set.size()&1)){
            System.out.println(set.size());
        }
        else{
            System.out.println(set.size()-1);
        }
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solver();
        }
    }
}
