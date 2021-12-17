import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int move[] = {1, 2, 3, 4, 5};
        int step = 0, i = 4, rV = n;
        while(i >= 0){
            if(move[i] <= rV){
                rV = rV - move[i];
                step++;
            }
            else i--;
        }

        System.out.println(step);
    }
}
