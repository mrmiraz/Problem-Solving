import java.util.HashSet;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Character> set = new HashSet<>();
        int n = sc.nextInt();
        String nextline = sc.next();
        nextline = nextline.toLowerCase();
        for(int i = 0; i < nextline.length(); i++){
            set.add(nextline.charAt(i));
        }
        if(set.size() == 26) 
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
