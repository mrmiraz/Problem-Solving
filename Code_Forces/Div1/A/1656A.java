import java.util.*;

public class Solution {
    static Scanner sc = new Scanner(System.in);
    
    public static void solver() {
        int n = sc.nextInt();
        int a[] = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            map.put(a[i], i+1);
        }
        
        Arrays.sort(a);
        System.out.println(map.get(a[0]) + " "+ map.get(a[n-1]));
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solver();
        }
    }
    
}      
