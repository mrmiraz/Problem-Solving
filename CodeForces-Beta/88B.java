import java.util.*;

public class Solution {

    static Scanner sc = new Scanner(System.in);

    public class Cordinate {

        int x, y;

        Cordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static int getDistance(int x1, int x2, int y1, int y2) {
        int x = (x1 - x2);
        int y = (y1 - y2);
        return (x * x + y * y);
    }

    public static void solver() {
        int n = sc.nextInt(), m = sc.nextInt(), x = sc.nextInt();
        char[][] keyboard = new char[n][m];
        HashMap<Character, ArrayList<Cordinate>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            keyboard[i] = sc.next().toCharArray();
            for (int j = 0; j < m; j++) {
                if (map.containsKey(keyboard[i][j])) {
                    map.get(keyboard[i][j]).add(new Solution().new Cordinate(i, j));
                } else {
                    map.put(keyboard[i][j], new ArrayList<>());
                    map.get(keyboard[i][j]).add(new Solution().new Cordinate(i, j));
                }
            }
        }

        int q = sc.nextInt(), ans = 0;
        char[] text = sc.next().toCharArray();

        for (int i = 0; i < q; i++) {

            if (text[i] >= 'A' && text[i] <= 'Z') {
                if (!map.containsKey((char) (text[i] + 32)) || !map.containsKey('S')) {
                    System.out.println("-1");
                    return;
                }
                int distance = Integer.MAX_VALUE;
                for (Cordinate sCordinates : map.get('S')) {
                    for (Cordinate tCordinates : map.get((char) (text[i] + 32))) {
                        distance = Math.min(distance, getDistance(sCordinates.x, tCordinates.x, sCordinates.y, tCordinates.y));

                    }
                }
                if (distance > x * x) {
                    ans++;
                }
            } else if (!map.containsKey((text[i]))) {
                System.out.println("-1");
                return;
            }
        }
        System.out.println(ans);

    }

    public static void main(String[] args) {
        solver();
    }
}
