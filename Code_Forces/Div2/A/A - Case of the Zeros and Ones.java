import java.util.*;
public class Solution {
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Stack<Character> stack = new Stack<>();
       char[] oposite = {'1', '0'};
       int n = sc.nextInt();
       String line = sc.next();
       for(int i = 0; i < line.length(); i++){
           if(!stack.isEmpty() && stack.peek() == oposite[line.charAt(i)-'0']){
               stack.pop();
           }
           else
            stack.add(line.charAt(i));
       }
        System.out.println(stack.size());
    }
}
