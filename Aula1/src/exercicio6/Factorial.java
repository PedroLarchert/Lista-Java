package exercicio6;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int[] m = new int[n];
		
		for(int x = 0; x < n; x++) {
			m[x] = scan.nextInt();
		}
		
		for(int x = 0; x < n; x ++) {
			int num = m[x];
			for(int j = num ;j > 1; j--) {
				num *= j-1;
			}
			System.out.println("o fatorial de "+m[x]+" é "+num);
		}
	}
}
