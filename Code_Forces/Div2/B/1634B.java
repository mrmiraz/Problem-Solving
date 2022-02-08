import java.util.*;

public class Solution {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            Long n = sc.nextLong(), x = sc.nextLong(), y = sc.nextLong();
            long sum= 0;
            for(int j = 0; j < n; j++){
                sum += sc.nextLong();
            }
            if((x+y+sum)%2 == 0){
                System.out.println("Alice");
            }
            else
                System.out.println("Bob");
        }
    }
}
