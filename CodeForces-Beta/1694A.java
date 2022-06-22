import java.util.*;

public class Solution {

    static Scanner sc = new Scanner(System.in);

    public static void print(int x) {
        for (int i = 0; i < x; i++) {
            System.out.print("01");
        }
    }
    
    public static void printZero(int x){
        for(int i = 0; i < x;i++){
            System.out.print("0");
        }
    }
    
    public static void printOne(int x){
        for(int i =0; i < x; i++){
            System.out.print("1");
        }
    }


    public static void solver() {
        int a = sc.nextInt(), b = sc.nextInt();
        int d = Math.abs(a-b);
        if(a <= b){
            print(a);
            printOne(d);
        }
        else{
            print(b);
            printZero(d);
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solver();
        }
    }
}
