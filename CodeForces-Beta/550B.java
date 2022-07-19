import java.util.*;
import java.io.*;
import java.lang.*;

public class Main{
	static Scanner sc = new Scanner(System.in);
	public static void solve(){
		int n = sc.nextInt(), l = sc.nextInt(), r = sc.nextInt(), x = sc.nextInt();
		int[] problems = new int[n];
		for(int i = 0; i <n ; i++){
			problems[i] = sc.nextInt();
		}
		int ans = 0;
		for(int i = 0; i < (1 << n); i++){
			int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, totalDif = 0, count = 0;
			for(int j = n-1; j >=0; j--){
				if((i&(1<<j)) != 0){
					
					min = Math.min(problems[j], min);
					max = Math.max(problems[j], max);
					count++;
					totalDif += problems[j];
				}
			}
			
			if(totalDif >= l && totalDif <= r && (max-min) >= x && count > 1){
				ans++;
			}

		}

		System.out.println(ans);

	}

	public static void main(String args[]){
			solve();
	}
}
