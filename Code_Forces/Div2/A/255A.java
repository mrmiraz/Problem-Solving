import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = {0, 0, 0};
        int max = a[0], maxI = 0;
        String[] s = {"chest", "biceps", "back"};
        for(int i = 0; i < n; i++){
            a[i%3] += sc.nextInt();
            if(a[i%3] >  max){
                max = a[i%3];maxI = i%3;
            }
        }
        System.out.println(s[maxI]);
    }
}
