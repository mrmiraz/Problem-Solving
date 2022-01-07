import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int odd = 0;
        
        for(int i = 0; i < n; i++){
            double b = a[i]/2.0;
            int b1;
            if(a[i] % 2 != 0){
                if(odd == 0){
                    b1 = (int)Math.ceil(b);
                    odd++;
                }
                else{
                    b1 = (int)Math.floor(b);
                    odd = 0;
                }    
            }
            else
                b1 = (int)Math.floor(b);
            System.out.println(b1);
        }
    }
}
