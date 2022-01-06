import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int d = s.length();
        int flag = 0;
        for(int i = 1; i < d; i++){
            if(s.charAt(i) == '1'){
                flag = 1;
                break;
            }
        }
        if(flag == 0)
            System.out.println(d%2 == 0? d/2: (d-1)/2);
        else
            System.out.println(d%2 == 0? d/2: (d+1)/2);
    }
}
