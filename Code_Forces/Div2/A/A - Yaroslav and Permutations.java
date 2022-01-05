import java.util.HashMap;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0 ;i < n; i++){
            int a = sc.nextInt();
            if(map.containsKey(a)){
                map.put(a, map.get(a)+ 1);
            }
            else
                map.put(a, 1);
        }
        
        int maxDuplicate = 1;
        for(int key: map.keySet()){
            maxDuplicate = Math.max(maxDuplicate, map.get(key));
        }
        System.out.println(maxDuplicate <= (n+1)/2? "YES": "NO");
    }
}
