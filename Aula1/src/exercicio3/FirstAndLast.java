package exercicio3;

import java.util.Scanner;

public class FirstAndLast {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		boolean equals = false;
		int first = n % 10;
		
		if(n>10) {
			
		
			while(n != 0) {
			
				if(n / 10 == 0 && n == first) {
					equals=true;
				}
			
				n = n / 10 ;
			}
		
			if(equals == true) {
				System.out.println("o primeiro numero e igual ao ultimo");
			}
			else {
				System.out.println("o primeiro numero nao e igual ao ultimo");
			}
		}
		else {
				System.out.println("o numero so tem 1 algarismo");
		}

	}

}
