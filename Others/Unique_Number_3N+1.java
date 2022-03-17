/*
3N+1 problem
Given an array. Each of the element of the array is coming thrice, except one.
You have to find the unique number from the array
*/
import java.util.*;

public class practice {
    
    Scanner sc = new Scanner(System.in);
    static void updateSum(int[] arr_sum, int number){
        for(int i =0; i < 32;i++){
            int ith_bit = number & (1<<i);
            if(ith_bit != 0){
                arr_sum[i]++;
            }
        }
    }
    
    static int numberFromBits(int[] arr_sum){
        int num = 0;
        for(int i = 0; i < 32; i++){
            num += arr_sum[i] * (1<<i);
        }
        return num;
    }

    public static void main(String[] args) {
        int numbers[] = {5, 2, 5, 3, 5, 2, 2};
        int arr_sum[] = new int[32];
        Arrays.fill(arr_sum, 0);
        for(int number : numbers){
            updateSum(arr_sum, number);
        }
        for(int i = 0; i < 32; i++){
            arr_sum[i] = arr_sum[i]%3;
        }
        int u_number = numberFromBits(arr_sum);
        System.out.println(u_number);
    }
}
