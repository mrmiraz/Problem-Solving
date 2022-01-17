import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String l1 = sc.next(), l2 = sc.next();
        for(int i = 0 ;i < l1.length(); i++){
            System.out.print(l1.charAt(i)^l2.charAt(i));
        }
        System.out.println();
    }
}
