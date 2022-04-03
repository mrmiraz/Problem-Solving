import java.util.*;
public class Main {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Integer> graph[];
    static boolean used[];
    static int matchingArray[];
    static int n, m;
    
    static boolean kuhn(int v){
        if(used[v])return false;
        used[v] = true;
        for(int cNode: graph[v]){
            if(matchingArray[cNode] == -1 || kuhn(matchingArray[cNode])){
                matchingArray[cNode] = v;
                return true;
            }
        }
        return false;
    }
    
    @SuppressWarnings("unchecked")
    public static int solver() {
        
        n = sc.nextInt(); m = sc.nextInt();
        
        
        used = new boolean[n+1]; matchingArray = new int[n+1];
        Arrays.fill(matchingArray, -1);
        
        graph = new ArrayList[n+1];
        
        for(int i = 1; i <= n; i++){
            graph[i] = new ArrayList<>();
        }
        
        for(int i = 1; i <= m; i++){
            int a = sc.nextInt(), b = sc.nextInt();
            graph[a].add(b);
            graph[b].add(a);
        }
        
        int cnt = 0;
        for(int i = 1; i <= n; i++){
            Arrays.fill(used, false);
            if(kuhn(i)){
                cnt++;
            }
        }
        
        return n-cnt/2;
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        int i =0;
        while (t-- > 0) {
            int r = solver();
            System.out.println("Case "+(++i)+ ": "+r);
        }
    }
}
