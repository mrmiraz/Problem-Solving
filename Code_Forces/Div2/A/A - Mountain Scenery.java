import java.util.Scanner;
public class Solution{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] array = new int[2*n+2];
		for(int i = 1; i <= 2*n+1; i++){
			array[i] = sc.nextInt();
		}

		for(int i = 1; i <= 2*n+1; i++){
			if(i < 2*n+1 && k > 0 && i % 2 == 0 && array[i-1]+1 < array[i] && array[i] > array[i+1]+1){
			    array[i] = array[i] -1;
			    k--;
			}
			System.out.print(array[i] + " ");
		}
	}
}
