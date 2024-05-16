package Loja;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	       
	        System.out.println("Cadastro de Mídias:");
	        System.out.println("1. CD");
	        System.out.println("2. DVD");
	        System.out.print("Escolha o tipo de mídia: ");
	        int escolha = scanner.nextInt();

	        Midia midia;
	        if (escolha == 1) {
	            midia = new CD();
	        } else {
	            midia = new DVD();
	        }

	        midia.inserirDados();
	        midia.printDados();
	}

}
