import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), odd = 0, even = 0, sum = 0;
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            if(a%2 == 0)++even;else ++odd;
            sum += a;
        }
        System.out.println(sum % 2 == 0? even:odd); 
    }
}
