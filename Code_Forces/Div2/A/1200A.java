import java.util.*;

public class Solution {
    Scanner sc = new Scanner(System.in);

    public void insertLeft(int rooms[]){
        for(int i = 0; i < 10;i++){
            if(rooms[i] == 0){
                rooms[i] = 1;
                return;
            }
        }
    }
    public void insertRight(int rooms[]){
        for(int i = 9; i >= 0; i--){
            if(rooms[i] == 0){
                rooms[i] = 1;
                return;
            }
        }
    }
    public void solver() {
        int n = sc.nextInt();
        int rooms[] = new int[10];
        for(int i =0; i < 10; i++){
            rooms[i] = 0;
        }
        String s = sc.next();
        int left = 0, right = 9;
        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            if(c == 'L'){
                insertLeft(rooms);
            }
            else if(c == 'R'){
                insertRight(rooms);
            }
            else{
                rooms[c-'0'] = 0;
            }
        }
        for(int i = 0; i < 10; i++){
            System.out.print(rooms[i]);
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.solver();
    }
}
