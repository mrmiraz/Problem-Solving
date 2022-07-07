import java.util.*;

public class Solution {

    static Scanner sc = new Scanner(System.in);
    
    public static void solver() {
        int n = sc.nextInt(), m = sc.nextInt();
        int matrix[][] = new int[n][m];
        for(int i = 0; i < n; i+=2){
            for(int j = 0; j < m ; j+=2){
                if((i+j)%4 == 0){
                    matrix[i][j] = 1;
                    matrix[i][j+1] = 0;
                    matrix[i+1][j+1] = 1;
                    matrix[i+1][j] = 0;
                }
                else{
                    matrix[i][j] = 0;
                    matrix[i][j+1] = 1;
                    matrix[i+1][j+1] = 0;
                    matrix[i+1][j] = 1;
                }
            }
        }
        for(int i =0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solver();
        }
    }
}
