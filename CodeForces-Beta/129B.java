import java.util.*;

public class Solution {

    static Scanner sc = new Scanner(System.in);

    public static void solver() {
        int n = sc.nextInt(), m = sc.nextInt();
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            adjList.get(a).add(b);
            adjList.get(b).add(a);
        }
        
        int flag = 1, group = 0;
        while (flag == 1) {
            flag = 0;
            HashSet<Integer> set = new HashSet<>();
            int k = 0;
            for (ArrayList<Integer> list : adjList) {
                if (list.size() == 1) {
                    list.remove(0);
                    flag = 1;
                    set.add(k);
                }
                k++;
            }

            if (flag == 1) {
                group++;
                for (ArrayList<Integer> list : adjList) {
                    ArrayList<Integer> list1 = new ArrayList<>();
                    for (int node : list) {
                        list1.add(node);
                    }

                    for (int node : list1) {
                        if (set.contains(node)) {
                            list.remove(list.indexOf(node));
                        }
                    }

                }
            }

        }
        System.out.println(group);

    }

    public static void main(String[] args) {
        solver();
    }
}
