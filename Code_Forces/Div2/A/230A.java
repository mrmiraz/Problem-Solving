import java.util.*;
public class Solution {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int s =sc.nextInt(), n = sc.nextInt();
        int[][] xy = new int[n][2];
        for(int i =0; i < n; i++){
            xy[i][0] = sc.nextInt();
            xy[i][1] = sc.nextInt();
        }
        Arrays.sort(xy, (a, b)-> Integer.compare(a[0], b[0]));
        
        for(int i =0;i < n; i++){
            if(s > xy[i][0])s+= xy[i][1];
            else{
                System.out.println("NO");return;
            }
        }
        System.out.println("YES");
    }
}
