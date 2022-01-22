import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] color = {"R","O", "Y", "G", "B", "I", "V"};
        int n = sc.nextInt();
        for(int i = 0; i < 3;i++){
            System.out.print(color[i]);
        }
        for(int i = 3; i < n; i++){
            System.out.print(color[3+i%4]);
        }
        System.out.println();
    }
}
