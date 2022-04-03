import java.util.*;
public class Main {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Integer> graph[];
    static boolean used[];
    static int matchingArray[];
    static int nuts, bolts;
    
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
        
        nuts = sc.nextInt(); bolts = sc.nextInt();
        used = new boolean[nuts]; matchingArray = new int[bolts];
        Arrays.fill(matchingArray, -1);
        graph = new ArrayList[nuts];
        
        for(int i = 0; i < nuts; i++){
            graph[i] = new ArrayList<>();
        }
        
        for(int i = 0; i < nuts; i++){
            for(int j = 0; j < bolts; j++){
                int cbolt = sc.nextInt();
                if(cbolt == 1){
                    graph[i].add(j);
                }
            }
        }
        
        int cnt = 0;
        for(int i = 0; i < nuts; i++){
            Arrays.fill(used, false);
            if(kuhn(i)){
                cnt++;
            }
        }
        
        return cnt;
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        int i =0;
        while (t-- > 0) {
           int r = solver();
            System.out.println("Case "+(++i)+": a maximum of "+r+" nuts and bolts can be fitted together");
        }
    }
}
