import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        char firstLetter = line.charAt(0);
        if(firstLetter >= 'A' && firstLetter <= 'Z'){
            System.out.println(line);
        }
        else{
            line = (char)(firstLetter- 32) + line.substring(1);
            System.out.println(line);
        }

    }
}
