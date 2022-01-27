import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            b[i] = a[i];
        }
        HashMap<Integer, Integer>  map = new HashMap<>();
        Arrays.sort(b);
        for(int i= 0; i < n; i++){
            map.put(b[i], i);
        }
        
        for(int i = 0; i < n ; i++){
            a[i] = map.get(a[i]);
        }
        
        int l = -1;
        for(int i = 0; i < n; i++){
            if(a[i] != i){
                l = i;
                break;
            }
        }
        int r = -1;
        for(int i = n-1; i >= 0; i--){
            if(a[i] != i){
                r = i;break;
            }
        }
        if(r == -1 || l == -1){
            System.out.println("yes\n"+ "1" + " " + "1");
        }
        else{
            int left = l, right = r;
            while(left < right){
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++; right--;
            }
            boolean ok = true;
            for(int i = 0; i < n; i++){
                if(a[i] != i) ok = false;
            }
            
            if(ok){
                System.out.println("yes\n"+ (l+1) + " " + (r+1));
            }
            else
                System.out.println("no");
        }
    }
}
