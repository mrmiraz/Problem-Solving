import java.util.*;

public class sol{
	static Scanner sc = new Scanner(System.in);
	public static void solver(){
		int n = sc.nextInt();
		String s = sc.next();

		int sum =0;
		for(int i =0; i < n-1; i++){
			if(s.charAt(i) == '0'){
				if(i < n-2 && s.charAt(i+1) == '1' && s.charAt(i+2) == '1'){
					sum += 0;
				}
				else if(i < n-1 && i+1 != n-1 && s.charAt(i+1) == '1'){
					sum += 1;
				}
				else if(s.charAt(i+1) == '0') sum += 2;
			}
			
		}
		System.out.println(sum);
	}
	public static void main(String[] args){
		int t = sc.nextInt();
		while(t-->0){
			solver();
		}
	}
}
