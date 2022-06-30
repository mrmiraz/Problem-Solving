import java.util.*;
public class Solution {
    static Scanner sc = new Scanner(System.in);
    
    public static void solver() {
        int n = sc.nextInt();
        int a[] = new int[n];
        HashSet<Integer>  set = new HashSet<>();
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            set.add(a[i]);
        }
        Arrays.sort(a);
        int f = 0;
        for(int i = 0; i <n-2; i++){
            if(!set.contains(a[i]+a[i+1]+a[i+2])){
                f = 1;break;
            }
        }
        if(!set.contains(a[0]+a[1]+a[n-1]) || !set.contains(a[0]+a[n-1]+a[n-2])){
            f = 1;
        }
        if(f == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solver();
        }
    }
}
