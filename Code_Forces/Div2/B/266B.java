
import java.util.*;


public class Main{
	static Scanner sc = new Scanner(System.in);

	public static void swap(char[] ch, int i, int j){
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
	}

	public static void solver(){
		int n = sc.nextInt(), t = sc.nextInt();
		String s = sc.next();
		char[] ch = s.toCharArray();

		while(t-->0){
			for(int i = 0; i < n; i++){
			
				if(i < n -1 && ch[i] == 'B' && ch[i+1] == 'G'){
					swap(ch, i, i+1);
					i++;
				}
		   }
		}

		String res = String.valueOf(ch);
		System.out.println(res);
	}

	public static void main(String[] args){
		solver();
		
	}
}
