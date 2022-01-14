import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            int d = 10, c = 0;
            LinkedList<Integer> list = new LinkedList<>();
            while(n != 0){
                int m = n%d;
                n = n - m;
                if(m != 0){
                    c++;
                    list.add(m);
                } 
                d = d*10; 
            }
            System.out.println(c);
            for(int e : list)
                System.out.print(e +" ");
            System.out.println();
        }
    }
}
