import java.util.Scanner;

public class PowerOfTwo {
    public static boolean isPowerOfTwo(int number){
        if((number & (number-1)) == 0){
            return true;
        }
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(isPowerOfTwo(number)){
            System.out.println("The number is power of 2.");
        }
        else{
            System.out.println("The number is not power of 2.");
        }
    }
}
