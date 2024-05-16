package exercicio4;

public class Produto {
	private String nome;
	private double precoCusto;
	private double precoVenda;
	private double margemLucro;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPrecoCusto() {
		return precoCusto;
	}
	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}
	public double getPrecovenda() {
		return precoVenda;
	}
	public void setPrecoVenda(double precovenda) {
		if(precovenda>precoCusto) {
		this.precoVenda = precovenda;
		calcularMargemLucro();
		}else {
			System.out.println("o preco de venda nao pode ser maior que o preco de custo");
		}
	}
	
	public void calcularMargemLucro() {
		this.margemLucro = precoVenda - precoCusto; 
	}
	
	public double getMargemLucroPorcentagem() {
        return (margemLucro / precoVenda) * 100;
    }
	
	public double getMargemLucro() {
        return margemLucro;
    }
}
