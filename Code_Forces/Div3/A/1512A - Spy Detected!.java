import java.util.*;

public class Solution {

    public class Node {

        int occurence, index;

        public Node(int occurence, int index) {
            this.occurence = occurence;
            this.index = index;
        }
    }

    public void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            HashMap<Integer, Node> map = new HashMap<>();
            for (int j = 1; j <= n; j++) {
                int a = sc.nextInt();
                if (!map.containsKey(a)) {
                    map.put(a, new Node(1, j));
                } else {
                    map.put(a, new Node(map.get(a).occurence + 1, j));
                }

            }
            for (Node node : map.values()) {
                if (node.occurence == 1) {
                    System.out.println(node.index);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.solve();

    }
}
