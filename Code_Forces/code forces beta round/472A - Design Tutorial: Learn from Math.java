import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 2 == 0)
            System.out.println(n-4 + " " + 4);
        else
            System.out.println(n-9 + " " + 9);
    }
}
