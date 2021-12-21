import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] array = new Integer[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
            sum += array[i];
        }
        
        Arrays.sort(array, Collections.reverseOrder());
        int greedySumPrice = sum/2 + 1;
        int coinCout = 0, i = 0;
        while(greedySumPrice > 0){
            greedySumPrice -= array[i++];
            ++coinCout;
        }
        System.out.println(coinCout);
        
    }
}
