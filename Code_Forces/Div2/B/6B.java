import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        char c = sc.next().charAt(0);
        String[] line = new String[n];
        for(int i = 0; i < n; i++){
            line[i] = sc.next();
        }
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(line[i].charAt(j) == c){
                    if(i > 0)set.add(line[i-1].charAt(j));
                    if(i < n-1)set.add(line[i+1].charAt(j));
                    if(j > 0)set.add(line[i].charAt(j-1));
                    if(j < m-1)set.add(line[i].charAt(j+1));
                }
            }
        }
        set.remove(c);
        set.remove('.');
        System.out.println(set.size());
    }
}
