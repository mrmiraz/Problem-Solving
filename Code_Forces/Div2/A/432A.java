import java.util.*;
public class Solution {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int x[] = new int[5];
        for(int i =1; i < 5; i++){
            x[i] = sc.nextInt();
        }
        Arrays.sort(x);
        int a = 0, b = 0, c =0;
        for(int i =1; i < 5; i++){
            a = x[4]-x[1];
            b = x[4]- x[2];
            c = x[4] - x[3];
        }
        System.out.println(a + " "+ b + " "+ c);
    }
}
