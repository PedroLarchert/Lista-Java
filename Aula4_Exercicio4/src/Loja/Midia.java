package Loja;
import java.util.Scanner;
public class Midia {
	protected int codigo;
    protected double preco;
    protected String nome;

    public Midia() {}

    public Midia(int codigo, double preco, String nome) {
        this.codigo = codigo;
        this.preco = preco;
        this.nome = nome;
    }

    public String getTipo() {
        return "Midia";
    }

    public String getDetalhes() {
        return "Código: " + codigo + ", Nome: " + nome + ", Preço: " + preco;
    }

    public void printDados() {
        System.out.println(getTipo() + " - " + getDetalhes());
    }

    public void inserirDados() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Código: ");
        this.codigo = scanner.nextInt();
        System.out.print("Nome: ");
        this.nome = scanner.next();
        System.out.print("Preço: ");
        this.preco = scanner.nextDouble();
    }

    // Getters and setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
