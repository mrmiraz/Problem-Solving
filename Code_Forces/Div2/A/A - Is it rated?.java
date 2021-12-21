import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int rated = 0;
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            if(a[i] != b[i]){
                System.out.println("rated");
                return;
            }
        }
        
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                if(a[i] < a[j]){
                    System.out.println("unrated");
                    return;
                }
            }
        }
        System.out.println("maybe");
    }
}
