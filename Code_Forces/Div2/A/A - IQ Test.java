import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = new String[4];
        for(int i = 0 ;i < 4; i++){
            input[i] = sc.next();
        }
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                int white = 0;
                white += input[i].charAt(j) == '.'? 1: 0;
                white += input[i].charAt(j+1) == '.'? 1: 0;
                white += input[i+1].charAt(j) == '.'? 1: 0;
                white += input[i+1].charAt(j+1) == '.'? 1: 0;
                if(white != 2){
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");
    }
}
