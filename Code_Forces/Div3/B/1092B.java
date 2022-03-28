
import java.util.*;


public class Main{
	static Scanner sc = new Scanner(System.in);

	public static void solver(){
		int n  = sc.nextInt();
		int[]  a = new int[n];
		for(int i =0;i < n; i++){
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);
		int result = 0;
		for(int i = 1; i < n; i+=2){
			result = result + a[i] - a[i-1];
		}

		System.out.println(result);

	}

	public static void main(String[] args){
		solver();
		
	}
}
