import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int stopage = sc.nextInt();
        int insidePassenger = 0, maxPassenger = 0, enter, exit;
        for(int i = 0; i < stopage; i++){
            exit = sc.nextInt();
            enter = sc.nextInt();
            insidePassenger = enter - exit + insidePassenger;
            maxPassenger = Math.max(maxPassenger, insidePassenger);
        }
        System.out.println(maxPassenger);
    }
}
