import java.util.*;
 
public class Solution {
    Scanner sc = new Scanner(System.in);
    public class Node{
        int a, b;
        Node(int a, int b){
            this.a = a;
            this.b = b;
        }
    }
    public void solver() {
        int n = sc.nextInt();
        ArrayList<Node> list = new ArrayList<>();
        int r = n;
        n = n-1;
        while(n > 0){
            list.add(new Node(r, n));
            r = (int)Math.ceil((r+n)/2.0);
            n--;
        }
        System.out.println(r);
        for(Node node: list){
            System.out.println(node.a + " " + node.b);
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
