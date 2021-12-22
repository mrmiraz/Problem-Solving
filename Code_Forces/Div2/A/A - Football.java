import java.util.HashMap;
import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String team1 = "", team2 = "";
        for(int i = 0; i < n; i++){
            String team = sc.next();
            if(!map.containsKey(team)){
                if(map.isEmpty())
                    team1 = team;
                else
                    team2 = team;
                map.put(team, 1);
            }
            else{
                map.put(team, map.get(team)+1);
            }
        }
        
        if(team1.equals(""))
            System.out.println(team2);
        else if(team2.equals(""))
            System.out.println(team1);
        else{
            if(map.get(team1) > map.get(team2))
                System.out.println(team1);
            else
                System.out.println(team2);
        }
    }
}
