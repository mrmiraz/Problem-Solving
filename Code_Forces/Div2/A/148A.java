
import java.util.*;


public class Main{
	static Scanner sc = new Scanner(System.in);

	public static void solver(){
		int k = sc.nextInt();
		int l = sc.nextInt();
		int m = sc.nextInt();
		int n = sc.nextInt();
		int d = sc.nextInt();
		int count = 0;
		for(int i  = 1; i <= d; i++){
			if(i % k == 0 || i % l ==0 || i % m == 0 || i % n == 0){
				count++;
			}
		}

		System.out.println(count);
	}

	public static void main(String[] args){
		solver();
		
	}
}
