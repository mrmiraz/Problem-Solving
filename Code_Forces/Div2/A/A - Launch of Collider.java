import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String move = sc.next();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int minColition = Integer.MAX_VALUE;
        for(int i = 0; i < n-1; i++){
            if(move.charAt(i) == 'R' && move.charAt(i+1) == 'L'){
                minColition = Math.min(minColition, arr[i+1] - arr[i]);
            }
        }
        if(minColition != Integer.MAX_VALUE){
            System.out.println(minColition/2);
        }
        else
          System.out.println("-1");
    }
}
