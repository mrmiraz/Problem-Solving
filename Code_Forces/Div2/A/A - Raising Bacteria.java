
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int r = 0;
        while(n > 0){
            r += n%2;
            n = n/2;
        }
        System.out.println(r);
    }
}
