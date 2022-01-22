import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[100001];
        for(int i = 0; i < n; i++){
            a[sc.nextInt()] = i;
        }
        
        int m = sc.nextInt();
        long vasya = 0, patya = 0;
        for(int i = 0; i < m; i++){
            int b = sc.nextInt();
            vasya+= a[b]+1; patya += n-a[b];
        }
        System.out.println(vasya + " " + patya);
    }
}
