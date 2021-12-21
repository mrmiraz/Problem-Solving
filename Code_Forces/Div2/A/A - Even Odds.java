import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long pointer = (n+1)/2;
        if(k <= pointer)
            System.out.println(2*k-1);
        else
            System.out.println(2*(k-pointer));
    }
}
