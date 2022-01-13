import java.util.*;
public class Solution {
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String line = sc.next();
       Character[] vowel = {'a', 'e', 'i', 'o', 'u', 'y'};
       Set<Character> set = new HashSet<>(Arrays.asList(vowel));
       line = line.toLowerCase();
       for(int i = 0; i < line.length(); i++){
           if(!set.contains(line.charAt(i)))
               System.out.print("."+line.charAt(i));
       }
    }
}
