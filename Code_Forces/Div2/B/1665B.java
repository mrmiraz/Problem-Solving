import java.util.*;
public class Solution {
    static Scanner sc = new Scanner(System.in);
    
    public static void solver() {
        int n = sc.nextInt();
        int[] a = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for(int i =0; i < n; i++){
            a[i] = sc.nextInt();
            map.put(a[i], map.getOrDefault(a[i], 0)+1);
            max = Math.max(map.get(a[i]), max);
        }
        int i =0;
        int rem = n -max;
        while(max < n){
            i++;
            max = max*2;
        }
        System.out.println((rem + i));
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solver();
        }
    }
}
