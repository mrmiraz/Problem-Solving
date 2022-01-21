import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int[] a =new int[7];
            for(int j = 0;j < 7; j++){
                a[j]  = sc.nextInt();
            }
            System.out.println(a[0] + " " + a[1] + " "+ (a[6]-a[0]-a[1]));
        }
    }
}
