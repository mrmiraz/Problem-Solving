import java.util.Scanner;
 
public class Solution {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[6][6];
        int row = 0, col = 0;
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5; j++){
                array[i][j] = sc.nextInt();
                if(array[i][j] == 1){
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println(Math.abs(3-row) + Math.abs(3-col));
    }
}
