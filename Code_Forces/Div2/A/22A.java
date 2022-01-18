import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0; i < n;i++){
            int a = sc.nextInt();
            if(!list.contains(a))
                list.add(a);
        }
        if(list.size() != 1){
            Collections.sort(list);
            System.out.println(list.get(1)); 
        }
        else
            System.out.println("NO");
    }
}
