import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long  calculation = 0;
        long oddN = n%2 == 0? n/2: n/2+1;
        long evenN = n/2;
        calculation =  evenN*(evenN+1) - oddN * oddN;
        System.out.println(calculation);
    }
}
