package exercicio4;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Produto produto = new Produto();
		
		 System.out.print("Informe o nome do produto: ");
		 produto.setNome(entrada.nextLine());
		 
		 System.out.print("Informe o preco de custo: ");
		 produto.setPrecoCusto(entrada.nextInt());
		 
		 System.out.print("Informe o preco de venda: ");
		 produto.setPrecoVenda(entrada.nextInt());
		 
		 
		 System.out.println("Margem de lucro R$: " + produto.getMargemLucro());
	     System.out.println("Margem de lucro em percentual: " + produto.getMargemLucroPorcentagem() + "%");
	}

}
