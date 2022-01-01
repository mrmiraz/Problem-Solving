import java.util.*;
public class Solution{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long b = sc.nextInt();
		Long count = 0L;
		for(long i  = 1; i <= a; i++){
			long j = 5 - i%5;
			Long c = b-j;
			if(j <= b){
				count += c/5 + 1;
			}
			
		}
		System.out.println(count);
	}
}
