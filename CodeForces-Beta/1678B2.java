import java.util.*;
public class Solution {
    static Scanner sc = new Scanner(System.in);
    
    public static void solver() {
        int n = sc.nextInt();
        String s = sc.next();
        int oddSeg= 0, evenSeg = 0, l = -1;
        for(int i = 0; i < n; i+=2){
            if(s.charAt(i) != s.charAt(i+1)){
                oddSeg++;
            }
            else{
                if(l != s.charAt(i)){
                    evenSeg++;
                }
                l = s.charAt(i);
            }
        }
        
        System.out.println(oddSeg + " "+ Math.max(evenSeg, 1));
        
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solver();
        }
    }
}
