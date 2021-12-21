import java.util.HashSet;
import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        int n = sc.nextInt();
        int p = sc.nextInt();
        
        for(int i = 0; i < p; i++){
            int x = sc.nextInt();
            set.add(x);
        }
        
        int q = sc.nextInt();
        
        for(int i = 0; i < q; i++){
            set.add(sc.nextInt());
        }
        
        if(set.size() == n)
            System.out.println("I become the guy.");
        else
            System.out.println("Oh, my keyboard!");  
    }
}
