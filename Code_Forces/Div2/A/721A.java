import java.util.HashMap;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        HashMap<Integer, Integer> map = new HashMap<>();
        int key = 0;
        if(s.charAt(0) == 'B')
            map.put(key, 1);
        for(int i = 1; i < n; i++){
            if(s.charAt(i) == 'B'){
                if(s.charAt(i-1) == 'W')
                    map.put(++key, 1);
                else
                    map.put(key, map.get(key)+1);
            }     
        }
        
        System.out.println(map.size());
        for(int i : map.values()){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
