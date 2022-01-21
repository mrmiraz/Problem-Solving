import java.util.*;

public class Solution {
    
    public class Node{
        int b, m;
        public Node(int b, int m){
            this.b = b;this.m = m;
        }
    }
    public void solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        PriorityQueue<Node> pq = new PriorityQueue<>((a,b)->a.m < b.m?1:-1);
        for(int i = 0; i < m; i++){
            pq.add(new Node(sc.nextInt(), sc.nextInt()));
        }
        int tm = 0;
        while(n > 0 && !pq.isEmpty()){
            Node node = pq.poll();
            if(n >= node.b){
                n = n - node.b;
                tm += node.m*node.b; 
            }
            else{
                tm += node.m * n;
                n = 0;
            }
        }
        System.out.println(tm);
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.solve();
    }
}
