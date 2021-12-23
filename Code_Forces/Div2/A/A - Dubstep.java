import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input = input.replaceAll("WUB", " ");
        input = input.trim().replaceAll(" +", " ");
        System.out.println(input);
    }
}
