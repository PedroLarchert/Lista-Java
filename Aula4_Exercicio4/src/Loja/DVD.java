package Loja;
import java.util.Scanner;

public class DVD extends Midia {
	private int nFaixas;

    public DVD() {}

    public DVD(int codigo, double preco, String nome, int nFaixas) {
        super(codigo, preco, nome);
        this.nFaixas = nFaixas;
    }

    @Override
    public String getTipo() {
        return "DVD";
    }

    @Override
    public String getDetalhes() {
        return super.getDetalhes() + ", Número de faixas: " + nFaixas;
    }

    public void setFaixas(int f) {
        this.nFaixas = f;
    }

    @Override
    public void inserirDados() {
        super.inserirDados();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Número de faixas: ");
        this.nFaixas = scanner.nextInt();
    }
}
