import java.util.*;
public class Solution {
    static Scanner sc = new Scanner(System.in);
    
    public static void solver() {
        int[] input = new int[4];
        for(int i =0; i < 4; i++){
            input[i] = sc.nextInt();
        }
        int count  = 0;
        for(int i = 1; i < 4; i++){
            if(input[i] > input[0]){
                count++;
            }
        }
        System.out.println(count);
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solver();
        }
    }
}
