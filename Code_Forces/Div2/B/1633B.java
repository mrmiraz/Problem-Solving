
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            int zero = 0, one = 0;
            if(s.length() == 1)
                System.out.println("0");
            else{
                for(int j = 0; j < s.length(); j++){
                    if(s.charAt(j) == '0')zero++;
                    else one++;
                }
                if(zero == one && one == 1)
                    System.out.println("0");
                else if(zero == one){
                    System.out.println(zero - 1);
                }
                else
                    System.out.println(Math.min(zero, one));
            } 
        }
    }
}
