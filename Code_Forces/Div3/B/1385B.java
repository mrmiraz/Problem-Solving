import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for(int j = 0; j < 2*n; j++){
                int a = sc.nextInt();
                if(!list.contains(a))list.add(a);
            }
            for(int a: list){
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
