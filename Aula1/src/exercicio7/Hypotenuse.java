package exercicio7;

import java.util.Scanner;

public class Hypotenuse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
        System.out.println("Hipotenusas de triângulos retângulos com catetos inteiros entre 1 e " + n + ":");
        for (int hipotenusa = 1; hipotenusa <= n; hipotenusa++) {
            for (int cateto1 = 1; cateto1 < hipotenusa; cateto1++) {
                for (int cateto2 = cateto1 + 1; cateto2 < hipotenusa; cateto2++) {
                    if ((cateto1 * cateto1 + cateto2 * cateto2) == hipotenusa * hipotenusa) {
                        System.out.println(hipotenusa);
                    }
                }
            }
        }

	}

}
