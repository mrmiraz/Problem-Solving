import java.util.*;

public class Solution {
    public void solver() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            TreeMap<Integer, Integer> map = new TreeMap<>();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                if(map.containsKey(a[i])){
                    map.put(a[i], map.get(a[i])+1);
                }
                else{
                    map.put(a[i], 1);
                }
            }

           for(int key: map.keySet()){
               System.out.print(key + " ");
               map.put(key, map.get(key)-1);
           }
           for(int key: map.keySet()){
               for(int i = 1; i <= map.get(key); i++){
                   System.out.print(key + " ");
               }
           }
           System.out.println();
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.solver();
    }
}
