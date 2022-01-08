import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[3];
        
        for(int i = 0; i < n; i++){
            int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
            arr[0] = arr[0] +x;
            arr[1] = arr[1]+y;
            arr[2] = arr[2]+z;
        }
        for(int i = 0; i < 3; i++){
            if(arr[i] != 0){
                System.out.println("NO");
                return;
            }
                
        }
        System.out.println("YES");
    }
}
