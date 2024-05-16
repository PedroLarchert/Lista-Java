package exercicio3;

public class Produto {
	private String nome;
	private float preco;
	private int quantidade;
	
	public Produto(String nome, float preco, int quantidade) {
		this.nome= nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public Produto() {
		nome= "VAZIO";
		preco = 0;
		quantidade = 0;
	}
	
	public void adicionarDoEstoque(int quantidade) {
		this.quantidade += quantidade; 
	}
	
	public void removerDoEstoque(int quantidade) {
		this.quantidade -= quantidade; 
	}
	
	public void exibirInfo() {
		System.out.println("produto: "+nome);
		System.out.println("preco: "+preco);
		System.out.println("quantidade em estoque: "+quantidade);
		System.out.println("_____________________________________________________");
	}
}
