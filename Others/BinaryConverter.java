import java.util.Scanner;

public class BinaryConverter {
    static int decimalToBinary(int n){
        int ans = 0;
        int p = 1;
        while(n > 0){
            int last_bit = n&1;
            ans += p*last_bit;
            p = p*10;
            n = n >> 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(decimalToBinary(n));
    }
}
