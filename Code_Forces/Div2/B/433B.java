import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Long[] a = new Long[n], sa = new Long[n], c = new Long[n], d = new Long[n];
        for(int i = 0; i < n; i++){
            sa[i] = a[i] = sc.nextLong();
        }
        Collections.sort(Arrays.asList(sa));
        c[0] = a[0];d[0] = sa[0];
        for(int i =1 ;i < n; i++){
            c[i] = c[i-1]+a[i];
            d[i] = d[i-1] + sa[i];
        }
        int m = sc.nextInt();
        for(int i = 0; i < m; i++){
            int type = sc.nextInt(), l = sc.nextInt(), r = sc.nextInt();
            l--;r--;
            if(type == 1)
                System.out.println(c[r] - c[l] + a[l]);
            else
                System.out.println(d[r] - d[l] + sa[l]);
        }
    }
}
