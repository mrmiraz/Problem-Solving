import java.util.*;
public class Main {

    static Scanner sc = new Scanner(System.in);
    
    static ArrayList<Integer> graph[];
    static boolean used[];
    static int matchingArray[];
    static int X, Y, edges;
    
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
    
    @SuppressWarnings({"unchecked"})
    static int solver(){
        
        
        X = sc.nextInt();
        used = new boolean[X]; 
        graph = new ArrayList[X];
        
        for(int i = 0; i < X; i++){
            graph[i] = new ArrayList<>();
        }
        
        int a[] = new int[X];
        for(int i =0; i < X; i++){
            a[i] = sc.nextInt();
        }
        
        Y = sc.nextInt();
        matchingArray = new int[Y];
        Arrays.fill(matchingArray, -1);
        
        for(int i =0; i < Y; i++){
            int b = sc.nextInt();
            for(int j = 0; j < X; j++){
                if(b%a[j] == 0){
                    graph[j].add(i);
                }
            }
        }

        int cnt = 0;
        for(int i = 0; i < X; i++){
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
        while(t-->0){
            int r = solver();
            System.out.println("Case "+(++i) + ": "+ r);
        }
    }
}
