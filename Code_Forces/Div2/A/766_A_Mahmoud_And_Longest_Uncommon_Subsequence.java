package learning.Solution;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstLine = sc.nextLine();
        String secondLine = sc.nextLine();
        if (firstLine.equals(secondLine)) {
            System.out.println(-1);
        } else if (firstLine.length() != secondLine.length()) {
            System.out.println(Math.max(firstLine.length(), secondLine.length()));
        } else {
            System.out.println(firstLine.length());
        }
    }
}
