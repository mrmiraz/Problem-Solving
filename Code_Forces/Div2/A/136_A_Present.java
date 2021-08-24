import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstLine = sc.nextLine();
        String nextLine = sc.nextLine();
        StringTokenizer st = new StringTokenizer(firstLine);
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(nextLine);
        int value = 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        while(value <= n){
            map.put(Integer.parseInt(st.nextToken()), value);
            value++;
        }
        for(int i = 1; i <= n; i++){
            System.out.print(map.get(i)+ " ");
        }
    }
}