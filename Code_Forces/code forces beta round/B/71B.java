import java.util.*;

public class Solution {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String[] crops = {"Grapes","Carrots" ,"Kiwis" };
        int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt(), t = sc.nextInt();
        int waste[] = new int[k];
        for(int i =0; i < k; i++){
            int a = sc.nextInt(), b = sc.nextInt();
            waste[i] = m*(a-1) + b;
        }
        
        Arrays.sort(waste);
        
        for(int i = 0;i < t; i++){
            int r = sc.nextInt(), c = sc.nextInt();
            int pointer = m*(r-1) + c;
            int index = 0;
            while(index < k){
                if(pointer <= waste[index])break;
                index++;
            }
            if(index < k && waste[index] == pointer)
                System.out.println("Waste");
            else{
                System.out.println(crops[(pointer-index)%3]);
            }
        }
        
    }
}
