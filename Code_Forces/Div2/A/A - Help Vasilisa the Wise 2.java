import java.util.*;

public class Solution{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int r1 = sc.nextInt(), r2 = sc.nextInt(), c1 = sc.nextInt(), c2 = sc.nextInt(), d1 = sc.nextInt(), d2 = sc.nextInt();
		int a = (r1 + c1 -d2)/2;
		int b = r1 - a;
		int c = c1 - a;
		int d = d1 - a;

		if(a+b == r1 && c+d == r2 && a+c == c1 && b+d == c2 && a+d == d1 && b+c == d2&&
			a != b && a != c && a != d && b != c && b != d && c != d &&
			a > 0 && a < 10 && 
			b > 0 && b < 10 && 
			c > 0 && c < 10 &&
			d > 0 && d < 10)
			System.out.println(a + " " + b + "\n" + c + " " + d );
		else
			System.out.println("-1");

	}
}
