
import java.util.*;


public class Main{
	static Scanner sc = new Scanner(System.in);

	public static void solver(){
		int n = sc.nextInt();
		HashSet<Integer> set = new HashSet<>();

		for(int i =0;i < n; i++){
			set.add(sc.nextInt());
		}

		System.out.println(set.size());
	}

	public static void main(String[] args){
		int t = sc.nextInt();
		while(t-->0){
			solver();
		}
		
	}
}
