import java.util.*;
 
public class Solution {
    
    Scanner sc = new Scanner(System.in);
    
    public void solver() {
      String s = sc.next();
      ArrayList<Integer> deq = new ArrayList<>();
      for(int i = 1; i <= s.length(); i++){
          if(s.charAt(i-1) == 'R'){
              deq.add(i);
          }
      }
      if(deq.isEmpty()){
          System.out.println(s.length()+1);
      }
      else{
          int d = deq.get(0);
          for(int i = 1; i < deq.size(); i++){
              d = Math.max(deq.get(i)-deq.get(i-1), d);
          }
          d = Math.max(d, s.length()-deq.get(deq.size()-1)+1);
          System.out.println(d);
      }
    }
    
    public static void main(String[] args) {
        Solution s = new Solution();
        int t = s.sc.nextInt();
        while (t-- > 0) {
            s.solver();
        }
    }
}
