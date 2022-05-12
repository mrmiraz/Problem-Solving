import java.util.*;
public class Solution {
    static Scanner sc = new Scanner(System.in);
    
    public static void solver() {
        int n = sc.nextInt();
        String s = sc.next();
        int count = 1;
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < n-1; i++){
            if(s.charAt(i) == s.charAt(i+1))count++;
            else{
                list.add(count);
                count = 1;
            }
        }
        if(s.charAt(n-1) == s.charAt(n-2))list.add(count);
        else list.add(1);
        int length = list.size();
        count = 0;
        for(int i = 0; i < length-1; i++){
         
            if(list.get(i)%2 != 0){
                count++;
                list.set(i, list.get(i)+1);
                list.set(i+1, list.get(i+1)-1);
            }
        }
        System.out.println(count);
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solver();
        }
    }
}
