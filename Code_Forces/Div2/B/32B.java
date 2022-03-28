
import java.util.*;


public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String s = sc.next();
		for(int i = 0; i < s.length(); i+=2){
			if(i < s.length()-1 && s.charAt(i) == '-' && s.charAt(i+1) == '.'){
				sb.append("1");
			}
			else if(i < s.length()-1 && s.charAt(i) == '-' && s.charAt(i) == '-'){
				sb.append("2");
			}
			else{
				sb.append("0");
				--i;
			}
		}
		System.out.println(sb.toString());
	}
}
