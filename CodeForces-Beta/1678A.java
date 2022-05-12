import java.util.*;
public class Solution {
    static Scanner sc = new Scanner(System.in);
    
    public static void solver() {
        int n = sc.nextInt();
        int[] arr =new int[101];
        boolean hasDuplicate = false;
        int zeros = 0;
        for(int i =0; i < n; i++){
            int a = sc.nextInt();
            arr[a] = arr[a]+1;
            if(a == 0)zeros++;
            if(arr[a] >= 2)hasDuplicate = true;
            
        }
        if(zeros > 0)
            System.out.println(n-zeros);
        else if(hasDuplicate)
            System.out.println(n);
        else
            System.out.println(n+1);
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solver();
        }
    }
}
