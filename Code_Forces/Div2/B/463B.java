import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), maxE = Integer.MIN_VALUE;
        for(int i = 1; i <= n; i++){
            maxE = Math.max(sc.nextInt(), maxE);
        }
        System.out.println(maxE);
    }
}
