import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        
        for(int i = 0; i < n; i++){
            if(s.charAt(i) != '.'){
                if(s.charAt(i) == 'L')
                    System.out.println((i+1) + " " + i);
                else
                {
                    while(s.charAt(i) == 'R'){
                        i++;
                    }
                    System.out.println(i + " " + (i+1));
                }
                break;
            }
        }
    }
}
