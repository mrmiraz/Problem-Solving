import java.util.HashMap;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = new String[3];
        HashMap<Character, Integer> left = new HashMap<>();
        HashMap<Character, Integer> right = new HashMap<>();
        
        for(int i = 0; i < 3; i++){
            a[i] = sc.next();
            if(a[i].charAt(1) == '>'){
                if(!left.containsKey(a[i].charAt(0)))
                    left.put(a[i].charAt(0), 1);
                else
                    left.put(a[i].charAt(0), left.get(a[i].charAt(0))+1);
                if(!right.containsKey(a[i].charAt(2)))
                    right.put(a[i].charAt(2), 1);
                else
                    right.put(a[i].charAt(2), right.get(a[i].charAt(2))+1);
            }
            else{
                if(!right.containsKey(a[i].charAt(0)))
                    right.put(a[i].charAt(0), 1);
                else
                    right.put(a[i].charAt(0), right.get(a[i].charAt(0))+1);
                if(!left.containsKey(a[i].charAt(2)))
                    left.put(a[i].charAt(2), 1);
                else
                    left.put(a[i].charAt(2), left.get(a[i].charAt(2))+1);
            }
        }
        
        String x = null, y = null, z  = null;
        for(char key : right.keySet()){
            if(right.get(key) == 2)
                x = ""+key;
        }
        for(char key : left.keySet()){
            if(left.get(key) == 1)
                y = ""+key;
            if(left.get(key) == 2)
                z = ""+key;
        }
        if(x == null || z == null || y ==  null)
            System.out.println("Impossible");
        else
          System.out.println(x+y+z);
    }
}
