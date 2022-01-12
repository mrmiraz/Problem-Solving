import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] array = {100, 20, 10,5, 1};
       int i = 0, count = 0;
       while(n > 0){
           if(n >= array[i]){
               n = n - array[i];
               count++;
           }
           else
               i++;
       }
        System.out.println(count);
    }
}
