package exercicio4;

import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i = scan.nextInt();
		int j = scan.nextInt();
		
		int[] list = new int[n];
		int number = 0;
		int cont = 0;
		
		while(cont < n) {
			
			if(number % i == 0 || number % j == 0 ) {
				list[cont] = number;
				cont++;
			}
			number++;
		}
		
		for(int x = 0; x < list.length; x++) {
			System.out.print(list[x]+" ");
		}
	}
}


