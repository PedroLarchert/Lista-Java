package Loja;
import java.util.Scanner;

public class CD extends Midia{
	private int nMusicas;

    public CD() {}

    public CD(int codigo, double preco, String nome, int nMusicas) {
        super(codigo, preco, nome);
        this.nMusicas = nMusicas;
    }

    @Override
    public String getTipo() {
        return "CD";
    }

    @Override
    public String getDetalhes() {
        return super.getDetalhes() + ", Número de músicas: " + nMusicas;
    }

    public void setMusica(int m) {
        this.nMusicas = m;
    }

    @Override
    public void inserirDados() {
        super.inserirDados();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Número de músicas: ");
        this.nMusicas = scanner.nextInt();
    }
}
