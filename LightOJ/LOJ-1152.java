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
        
        String grid[] = new String[n];
        
        for(int i =0; i < n; i++){
            grid[i] = sc.next();
        }
        
        used = new boolean[n*m]; matchingArray = new int[n*m];
        Arrays.fill(matchingArray, -1);
        graph = new ArrayList[n*m];
        
        for(int i = 0; i < n*m; i++){
            graph[i] = new ArrayList<>();
        }
        
        int x_axes[] = {0, 1, 0, -1};
        int y_axes[] = {-1, 0, 1, 0};
        int gold = 0;
        
        for(int i =0; i < n; i++){
            for(int j = 0; j < m; j++){
               
                if(grid[i].charAt(j) == '*'){
                    gold++;
                    int from = i*m+j;
                    for(int k = 0; k < 4; k++){
                        int x1 = i + x_axes[k];
                        int y1 = j + y_axes[k];
                        int to = x1*m + y1;
                        if(x1>=0&& x1< n && y1 >= 0 && y1 < m && grid[x1].charAt(y1) == '*'){
                            graph[from].add(to);
                        }
                    }
                }
            }
        }
        

        
        int cnt = 0;
        for(int i = 0; i < n*m; i++){
            Arrays.fill(used, false);
            if(kuhn(i)){
                cnt++;
            }
        }
        
        int r = gold-cnt/2;
        return r;
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
