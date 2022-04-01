
import java.util.*;


public class Main{
	static Scanner sc = new Scanner(System.in);

	public static void solver(){
		String host = sc.next();
		String guest = sc.next();
		String letter = sc.next();
		String combine = host + guest;

		char[] name = combine.toCharArray();
		Arrays.sort(name);
		char[] l = letter.toCharArray();
		Arrays.sort(l);

		if(String.valueOf(name).equals(String.valueOf(l))){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
		

	}

	public static void main(String[] args){
		solver();
		
	}
}
