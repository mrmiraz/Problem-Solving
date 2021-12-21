import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        int min = array[0];
        int max = array[n-1];
        int count = 0;
        for(int i = 0; i < n; i++){
            if( array[i] > min && array[i] < max){
                ++count;
            }
        }
        System.out.println(count);
    }
}
