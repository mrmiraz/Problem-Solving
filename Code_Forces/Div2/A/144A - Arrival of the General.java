import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        List<Integer> arr1 = new ArrayList<>(Arrays.asList(arr));
        Collections.sort(arr1);
        int max = arr1.get(n-1), min = arr1.get(0);
        int left = 0, right = n-1;
        while(left < n || right >= 0){
            if(arr[left] != max)
                left++;
            if(arr[right]  != min)
                right--;
            if(arr[left] == max && arr[right]  == min)
                break;
        }
       
        if(left > right)
            
          System.out.println(left - 0 + n-right-2);
        else
            System.out.println(left - 0 + n-right-1);
    }
}
