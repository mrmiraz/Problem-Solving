// implementation with stack to reverse the string

import java.util.Scanner;
import java.util.Stack;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        String s = sc.nextLine();
        String reverseS = sc.nextLine();
        for(int i = 0; i < s.length(); i++){
            stack.push(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            sb.append(stack.pop());
        }
        if(sb.toString().equals(reverseS)){
            System.out.println("YES");
        }
        else
            System.out.println("NO");
    }
}

// implementation with build in function to reverse the string
import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String reverseS = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);

        if(sb.reverse().toString().equals(reverseS)){
            System.out.println("YES");
        }
        else
            System.out.println("NO");
    }
}
