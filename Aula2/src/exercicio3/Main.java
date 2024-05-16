package exercicio3;

public class Main {

	public static void main(String[] args) {
		
		Produto produto1 = new Produto("Farinha de mandioca", 9.50f, 25);
		produto1.adicionarDoEstoque(5);
		produto1.removerDoEstoque(3);
		produto1.exibirInfo();
	}

}
