import java.util.*;
public class Solution {
    static Scanner sc = new Scanner(System.in);
    
    public static boolean isArPoint(char[][] cb, int i,int j){
        if(cb[i-1][j-1] == '#' &&
           cb[i-1][j+1] == '#' &&
           cb[i+1][j+1] == '#' &&
           cb[i+1][j-1] == '#')return true;
        return false;
    }
    public static void solver() {
        char[][] cb = new char[8][8];
        for(int i =0; i < 8; i++){
            cb[i] = sc.next().toCharArray();
        }
        
        for(int i = 1; i < 7; i++){
            for(int j = 1; j < 7; j++){
                if(isArPoint(cb, i, j)){
                    System.out.println((i+1) + " "+ (j+1));
                    return;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solver();
        }
    }
}
