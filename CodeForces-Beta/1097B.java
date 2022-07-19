import java.util.*;
import java.io.*;
import java.lang.*;

public class Main{
	static Scanner sc = new Scanner(System.in);
	static boolean ans = false;
	public static void backTrack(int[] deg, int i, int sum){
		if(i == deg.length){
				if(sum%360 == 0){
				 ans = true;
				}
			return;
		}
		backTrack(deg, i+1, sum+deg[i]);
		backTrack(deg, i+1, sum-deg[i]);
	}
	public static void solve(){
		int n = sc.nextInt();
		int[] deg = new int[n];
		for(int i =0; i <n ; i++){
			deg[i] = sc.nextInt();
		}
		backTrack(deg, 0, 0);
		if(ans == true){
			System.out.println("YES");
		}

		else {
			System.out.println("NO");
		}

	}
	public static void main(String args[]){
			solve();
	}
}
