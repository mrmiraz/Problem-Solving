import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), mishka = 0, chris = 0;
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt(), c = sc.nextInt();
            if(m > c)mishka++;
            if(m < c)chris++;
        }
        if(mishka > chris)
            System.out.println("Mishka");
        else if(chris > mishka)
            System.out.println("Chris");
        else
            System.out.println("Friendship is magic!^^");
    }
}
