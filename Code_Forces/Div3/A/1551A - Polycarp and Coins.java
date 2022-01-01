import java.util.*;
public class Solution{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for(int  i = 0; i < t; i++){
			int n = sc.nextInt();
			int c1, c2;
			if(n % 3 == 2)
				c2 = (n+1)/3;
			else
				 c2 = n/3;
			c1 = n - c2*2;
			System.out.println(c1 + " " + c2);
		}
	}
}
