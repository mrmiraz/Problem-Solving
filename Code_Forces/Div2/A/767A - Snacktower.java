import java.util.HashSet;
import java.util.Scanner;

public class Solution {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            HashSet<Integer> set = new HashSet<>();
            int n = sc.nextInt();
            int[] array = new int[n];
            int max = n;

            for(int i = 0; i < n; i++){
                array[i] = sc.nextInt();
            }

            for(int i = 0; i < n; i++){
                set.add(array[i]);
                while(set.contains(max)){
                    System.out.print(max + " ");
                    set.remove(max--);
                }
                if(i != n-1){
                    System.out.println();
                }
            }
        }
}
