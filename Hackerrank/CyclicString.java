/*
Problem:
Give two strings of lower case letters T and S. Take a decision whether T is a cyclic string of S or not. For example, abc and bca are two cyclic strings of one another. If we rotate abc for one time we get cab. Then again rotate cab and we get bca. That’s why abc and bca are two cyclic strings of each other. But abc and bac are not cyclic strings of each other.

***Rotate means moving the last character to the first position of a string.

Input Format

At first gives you an integer T (T<=10), is the number of test cases. Each case gives two strings T and S ( 1<=T,S<=1000000 ) in two separated lines.

Constraints

T<=10, 1<=T,S<=1000000

Output Format

Output “YES” if T is a cyclic string of S, otherwise output “NO”.

Sample Input 0

2
abc
bca
abc
bcd
Sample Output 0

YES
NO
*/
import java.io.*;
import java.util.*;

public class Solution {

    static int[] lps;
    static Scanner sc = new Scanner(System.in);
    public static void getLps(String pat){
        int patLen = pat.length();
        int i = 0, j = 1;
        lps[0] = 0;
        while(j < patLen){
            if(pat.charAt(i) == pat.charAt(j)){
                lps[j] = i+1;
                i++;j++;
            }
            else{
                if(i != 0){
                    i = lps[i-1];
                }
                else{
                    lps[j] = 0;
                    j++;
                }
            }
        }
    }
    
    public static void match(String text, String pat){
        int textLen = text.length(), patLen = pat.length();
        if(patLen != textLen/2){
            System.out.println("NO");
            return;
        }
        int i = 0, j = 0;
        while(i < textLen){
            if(text.charAt(i) == pat.charAt(j)){
                i++;j++;
            }
            else{
                if(j != 0){
                    j = lps[j-1];
                    
                }
                else{
                    i++;
                }
            }
            if(j == patLen){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
    
    public static void main(String[] args){
        int t = sc.nextInt();
        while(t--> 0){
            String text = sc.next(), pat = sc.next();
            text+=text;
            int patLen = pat.length();
            lps = new int[patLen];
            getLps(pat);
            match(text, pat);
        }
    }
}
