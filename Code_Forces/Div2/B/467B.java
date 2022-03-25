import java.util.*;
 
public class Solution {
    
    static Scanner sc = new Scanner(System.in);
    public static int countSet(int number){
        int counter = 0;
        for(int i =0; i < 32; i++){
            if((number & (1<<i)) > 0){
                counter +=1 ;
            }
        }
        return counter;
    }
    
    public static void main(String[] args) {
        int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
        int a[] = new int[m+1];
        for(int i =0; i < m+1; i++){
            a[i] = sc.nextInt();
        }
        int fedor = a[m];
        int friends = 0;
         for(int i =0; i < m; i++){
             int xor = fedor ^ a[i];
             int setBit = countSet(xor);
             if(setBit <= k){
                 friends++;
             }
         }
         System.out.println(friends);
    }        
}
