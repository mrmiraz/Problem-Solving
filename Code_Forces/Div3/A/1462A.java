import java.util.*;

public class Solution {
   
    public void print(Object o){
        System.out.print(""+o);
    }
    public void println(Object o){
        System.out.println(""+o);
    }
    public void solver(){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t--> 0){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = in.nextInt();
            }
            int left = 0;
            int right = n-1;
            while(left < right){
                print(a[left] + " "+ a[right] + " ");
                left++; right--;
            }
            if(left == right){
                print(a[left]);
            }
            println("");
        }
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        sol.solver();
   }
}
