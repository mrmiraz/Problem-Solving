import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int[] a = new int[3];
            a[0] = sc.nextInt();
            a[1] = sc.nextInt();
            a[2] = sc.nextInt();
            Arrays.sort(a);
            if(a[0] <= a[1] && a[1] == a[2]){
                System.out.println("YES");
                System.out.println(a[0] +" " + a[0] + " " + a[2]);
            }
            else
                System.out.println("NO");
        }
    }
}
