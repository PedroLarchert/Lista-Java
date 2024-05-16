package exercicio2;
import java.util.Scanner;
public class ConsecutiveNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n;
		
		boolean consec = false;
		n = scan.nextInt();
		
		while(n > 10) {
			
			int l = n % 10;
			n = n / 10;
			int a = n % 10;
			if(l == a) {
				consec = true;
			}
		}
		
		if(consec == true) {
			System.out.println("contem 2 numeros consecutivos");
		}
		else {
			System.out.println("não contem 2 numeros consecutivos");
		}
	}		
}
