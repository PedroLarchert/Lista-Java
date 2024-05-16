package exercicio5;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		boolean triangle = false;
		for(int i =1; i<=n; i++) {
			if(i*(i+1)*(i+2)==n) {
				triangle= true;
			}
		}
		if(triangle==true) {
			System.out.println(n+" é triangular");
		}else {
			System.out.println(n+" não é triangular");
		}
	}

}
