import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong(), r = sc.nextLong();
        
        if(l%2 != 0)
            l++;
        if(r - l < 2)
            System.out.println("-1");
        else
            System.out.println(l + " " + (l+1) + " " + (l+2));
    }
}
