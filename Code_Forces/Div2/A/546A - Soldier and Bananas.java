import java.util.Scanner;

public class Solution {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        int needToBorrow = (k*w*(w+1))/2 - n;
        needToBorrow = needToBorrow <= 0?0:needToBorrow;
        System.out.println(needToBorrow);
    }
}
