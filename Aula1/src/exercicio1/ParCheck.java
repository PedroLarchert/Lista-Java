package exercicio1;
import java.util.Scanner;

public class ParCheck {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int n;
			n = scan.nextInt();
			if (n % 2 == 0) {
				System.out.println(n + " é par");
			}
			else {
				System.out.println(n + " não é par");
			}
		}
	}


